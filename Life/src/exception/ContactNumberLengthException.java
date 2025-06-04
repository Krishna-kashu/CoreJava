package exception;

public class ContactNumberLengthException extends RuntimeException{
    public ContactNumberLengthException(String message){
        super(message);
    }
}
