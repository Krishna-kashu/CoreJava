package com.lambdaworks.internal;

@FunctionalInterface
interface NumberChecker {
    void check(int num);
}

public class EvenOddTest {
    public static void main(String[] args) {

        NumberChecker lambdaChecker = n -> System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"));
        lambdaChecker.check(5);

        NumberChecker anonChecker = new NumberChecker() {
            public void check(int num) {
                System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
            }
        };
        anonChecker.check(6);
    }
}
