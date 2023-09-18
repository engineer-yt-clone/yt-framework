package com.engineer.yt.tracing;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.UUID;
import org.springframework.web.servlet.ModelAndView;

@Component
@Slf4j
public class CorrelationInterceptor implements HandlerInterceptor {
    private static final String CORRELATION_ID_HEADER = "X-Correlation-ID";
    private static final String CORRELATION_ID_LOG_VAR_NAME = "correlationId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println();
        final String correlationId = getOrGenerateCorrelationId(request, response);
        MDC.put(CORRELATION_ID_LOG_VAR_NAME, correlationId);
        log.info("CorrelationId : {}", correlationId);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        MDC.remove(CORRELATION_ID_LOG_VAR_NAME);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }


    private String getOrGenerateCorrelationId(HttpServletRequest request, HttpServletResponse response) {
        String correlationId = request.getHeader(CORRELATION_ID_HEADER);
        if (correlationId == null) {
            correlationId = UUID.randomUUID().toString();
            response.addHeader(CORRELATION_ID_HEADER, correlationId);
        }
        return correlationId;
    }
}