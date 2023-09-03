package exceptions;

import lombok.Getter;

public record ResponseBase(Integer code, String message) {

}
