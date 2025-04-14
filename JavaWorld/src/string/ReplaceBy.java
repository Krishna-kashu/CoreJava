package string;

public class ReplaceBy {

        public static void replaceSpace(String sentence) {
            String replaced = sentence.replace(" ", "%");
            System.out.println("Replaced Sentence: " + replaced);
        }

        public static void main(String[] args) {
            String input = "hello world how are you";
            replaceSpace(input);
        }
    }

