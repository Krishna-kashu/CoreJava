package stringworkz.com;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        String arr = "";

        char[] newArray = str.toCharArray();
        int count =0;

        for(char a:newArray){
            count++;
        }
        for(int i = count-1; i>=0 ; i--){
            arr += newArray[i];
        }
        System.out.println("reversed array is:"+arr);
    }
}
