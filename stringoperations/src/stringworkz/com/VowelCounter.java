package stringworkz.com;

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        int count = 0;
        input = input.toLowerCase(); // normalize case

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
