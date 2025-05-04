package com.lambdaworks.internal;

@FunctionalInterface
interface PrimeChecker {
    boolean isPrime(int num);
}

public class PrimeTest {
    public static void main(String[] args) {
        PrimeChecker checker = (num) -> {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) return false;
            return true;
        };
        System.out.println(checker.isPrime(7));
        System.out.println(checker.isPrime(10));
    }
}