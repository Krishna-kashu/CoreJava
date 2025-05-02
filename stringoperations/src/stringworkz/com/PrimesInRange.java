package stringworkz.com;

public class PrimesInRange {
    public static void main(String[] args) {
        int A = 10, B = 30;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
}