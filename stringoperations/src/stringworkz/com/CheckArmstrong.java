package stringworkz.com;
public class CheckArmstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, original = num;
        while(num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        System.out.println("Armstrong: " + (sum == original));
    }
}