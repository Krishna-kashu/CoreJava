package string;

public class CharFrequency {

        public static void characterFrequency(String sentence) {
            // Convert sentence to char array
            char[] chars = sentence.replace(" ", "").toCharArray();

            // Iterate through each character in the array
            System.out.println("Character Frequency:");
            for (int i = 0; i < chars.length; i++) {
                // Skip already counted characters
                if (chars[i] == 0) continue;

                char currentChar = chars[i];
                int count = 1;

                // Count frequency of current character
                for (int j = i + 1; j < chars.length; j++) {
                    if (currentChar == chars[j]) {
                        count++;
                        chars[j] = 0; // Mark this character as counted
                    }
                }
                System.out.println(currentChar + " -> " + count);
            }
        }

        public static void main(String[] args) {
            String input = "hello world";
            characterFrequency(input);

        }
}
