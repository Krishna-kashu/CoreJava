package string;
public class CountWords {

    public static void wordCount(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }

    public static void main(String[] args) {
        String input = "hello world how are you";
        wordCount(input);
    }
}
