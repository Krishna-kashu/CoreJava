package exception;

public class EmailMissingAtException extends RuntimeException{
    public EmailMissingAtException(String message){
        super(message);
    }
}
