package exception;

public class NameStartsWithNumberException extends RuntimeException{
    public NameStartsWithNumberException(String message){
        super(message);
    }
}
