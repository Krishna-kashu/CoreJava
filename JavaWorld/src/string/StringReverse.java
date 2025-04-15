package string;

public class StringReverse {
        public static void reverseSentence(String sentence) {

            String revString = "";
            char[] arr = sentence.toCharArray();
            int count = 0;
            for (char ch : arr) {
                count++;
            }
            for (int i = count - 1; i >= 0; i--) {
                revString = revString + sentence.charAt(i);
            }
            System.out.println("Reversed Sentence: " + revString);
        }
    public static void main(String[] args) {
        String sentence = "Bangalore is a city";
        reverseSentence(sentence);
    }
    }
