package string;

public class SpaceCount {

        public static void countSpaces(String sentence) {
            int spaceCount = 0;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') spaceCount++;
            }
            System.out.println("Space Count: " + spaceCount);
        }

        public static void main(String[] args) {
            String input = "bbb bbb bbbb bbbbbb bbbb";
            countSpaces(input);
        }
    }