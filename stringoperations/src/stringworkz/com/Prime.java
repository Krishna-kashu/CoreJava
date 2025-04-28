package stringworkz.com;

public class Prime {
    public static void main(String[] args) {
        int num=17;
        boolean isPrime=true;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
