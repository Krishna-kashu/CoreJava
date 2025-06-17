package java8;

@FunctionalInterface
interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {

        Shape rectangle = ()  -> System.out.println("round.....");
        rectangle.draw();
        
        Shape square = () -> System.out.println("round.....");
        square.draw();
    }
}