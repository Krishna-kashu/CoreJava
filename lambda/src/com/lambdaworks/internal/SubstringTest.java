package com.lambdaworks.internal;
@FunctionalInterface
interface SubstringChecker {
    boolean contains(String str);
}

public class SubstringTest {
    public static void main(String[] args) {
        SubstringChecker checker = new SubstringChecker() {
            public boolean contains(String str) {
                return str.contains("ai");
            }
        };

        String[] words = {"brain", "train", "plain", "code"};
        for (String word : words)
            if (checker.contains(word)) System.out.println(word);
    }
}
