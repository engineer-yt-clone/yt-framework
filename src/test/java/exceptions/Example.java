package exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Example {

    private static final Logger logger
            = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        MDC.put("userId","TranDinh");
        MDC.put("correctionId","1lkjwe334");
        logger.info("Example log show userId and correctionId");
    }
}