package com.lambdaworks.internal;

@FunctionalInterface
interface PalindromeChecker {
    boolean isPalindrome(String str);
}

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeChecker checker = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        System.out.println(checker.isPalindrome("madam"));
        System.out.println(checker.isPalindrome("java"));
    }
}
