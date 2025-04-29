package stringworkz.com;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 3, 1};
        int smallest =Integer.MAX_VALUE;
        int secSmallest=Integer.MAX_VALUE;

        for (int num:arr){
            if(num<smallest){
                secSmallest=smallest;
                smallest=num;
            } else if (num<secSmallest && num !=smallest) {
                secSmallest=num;
            }
        }
        System.out.println(smallest);
        System.out.println(secSmallest);
    }
}
