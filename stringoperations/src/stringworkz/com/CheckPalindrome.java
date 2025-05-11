package stringworkz.com;

public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, original = num;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Is Palindrome: " + (original == rev));
    }
}
