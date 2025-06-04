package exception;

public class AddressNotNullException extends RuntimeException{
    public  AddressNotNullException(String message){
        super(message);
    }
}
