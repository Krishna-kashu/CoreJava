package string;

public class CountCharacter {

        public static void countCharacters(String sentence) {
            int count = 0;
            for (char c : sentence.toCharArray()) {
                if (c != ' ') count++;
            }
            System.out.println("Character Count (excluding spaces): " + count);
        }

        public static void main(String[] args) {
            String input = "hello world";
            countCharacters(input);
        }
    }

