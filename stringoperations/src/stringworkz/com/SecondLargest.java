package stringworkz.com;

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr={9, 9,7,5,8};
        int largest = 0;
        int secLargest = 0;

        for (int num:arr){
            if(num>largest){
                secLargest=largest;
                largest=num;
            } else if (num>secLargest && num!=largest) {
                secLargest=num;
            }
        }
        System.out.println(largest);
        System.out.println(secLargest);
    }
}
