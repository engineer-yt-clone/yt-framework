package exceptions;


import org.junit.jupiter.api.Test;

public class ArgumentInvalidExceptionTest {

    @Test
    public void getMessage() {
        String message = "message";
        ArgumentInvalidException exception = new ArgumentInvalidException(message);
        assert exception.getMessage().equals(message);
    }
}