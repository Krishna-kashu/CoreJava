package string;

public class StringReverse {
        public static void reverseSentence(String sentence) {
            StringBuilder stringBuilder = new StringBuilder(sentence);
            stringBuilder.reverse();
            System.out.println("Reversed Sentence: " + stringBuilder);
        }
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        reverseSentence(sentence);
    }
    }

