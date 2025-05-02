package stringworkz.com;

public class PalindromesInRange {
    public static void main(String[] args) {
        int A = 100, B = 150;
        for (int i = A; i <= B; i++) {
            if (isPalindrome(i)) System.out.print(i + " ");
        }
    }
    static boolean isPalindrome(int n) {
        int rev = 0, original = n;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
}
//101 111 121 131 141