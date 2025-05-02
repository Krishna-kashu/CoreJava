package stringworkz.com;

public class PrimesInRange {
    public static void main(String[] args) {
        int A = 10, B = 30;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
}