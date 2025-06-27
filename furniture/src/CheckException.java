import exceptionExample.Custom;

public class CheckException {
    public static void numeric(int var){
        try{
            if(var==11){
                System.out.println("Number is 11");

            }else{
                throw new Custom("Number does not match");
            }
        }catch (Custom e){
            System.err.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        System.out.println();numeric(12);
    }
}
