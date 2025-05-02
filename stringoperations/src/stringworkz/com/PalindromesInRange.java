package stringworkz.com;

public class PalindromesInRange {
    static boolean isPalindrome(int n) {
        int rev = 0, original = n;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
}