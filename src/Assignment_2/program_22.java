package Assignment_2;
//Subtract the Product and Sum of Digits of an Integer
public class program_22 {
    public static void main(String[] args) {
        int n =234;
        int product = 1;
        int sum = 0;
        while(n>0){
          int  rem = n%10;
          product = product*rem;
          sum= sum+rem;
          n=n/10;

        }

        int ans = product - sum;
        System.out.println(ans);
    }
}
