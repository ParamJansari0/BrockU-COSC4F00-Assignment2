package pkg4f00assignment2;

/**
 * This class is a exception used in the MyTrigClass.class
 * @author Param
 */
public class TrigException extends RuntimeException {

    public TrigException() {
        super("Invalid angle!");
    }

    public TrigException(String message) {
        super(message);
    }
}
