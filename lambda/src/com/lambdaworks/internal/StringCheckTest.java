package com.lambdaworks.internal;

@FunctionalInterface
interface StringChecker {
    boolean check(String str);
}

public class StringCheckTest {
    public static void filterStrings(String[] arr, StringChecker checker) {
        for (String s : arr)
            if (checker.check(s)) System.out.println(s);
    }

    public static void main(String[] args) {
        String[] words = {"hello", "madam", "world", "racecar"};

        filterStrings(words, s -> s.length() > 4);
    }
}