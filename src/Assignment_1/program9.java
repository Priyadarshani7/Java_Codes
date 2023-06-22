package Assignment_1;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
      int a = input.nextInt();
      int b = input.nextInt();
      int i;
      for( i=a; i<=b;i++){
          int num=i;
          int sum=0;

          while (num>0){
           int remainder = num%10 ;
           sum = sum + (remainder*remainder*remainder);
           num = num/10;
          }
          if(sum==i){
              System.out.println(sum);
          }
      }
    }
}
