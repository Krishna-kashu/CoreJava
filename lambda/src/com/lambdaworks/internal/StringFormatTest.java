package com.lambdaworks.internal;
@FunctionalInterface
interface StringConverter {
    String convert(String input);
}

public class StringFormatTest {
    public static void convertStrings(String[] arr, StringConverter converter) {
        for (String s : arr)
            System.out.println(converter.convert(s));
    }

    public static void main(String[] args) {
        String[] data = {"java", "openai", "lambda"};

        convertStrings(data, s -> s.toUpperCase());
    }
}
