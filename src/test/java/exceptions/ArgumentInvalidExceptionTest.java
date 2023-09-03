package exceptions;

import static org.junit.Assert.*;

import org.junit.Test;


public class ArgumentInvalidExceptionTest {

    @Test
    public void getMessage() {
        String message = "message";
        ArgumentInvalidException exception = new ArgumentInvalidException(message);
        assertEquals(message, exception.getMessage());
    }
}