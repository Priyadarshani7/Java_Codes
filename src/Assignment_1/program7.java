package Assignment_1;


import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers
public class program7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //fibonacci start with 0 and 1 number
        System.out.println("Remember fibonacci series start with 0 and 1 ");
        System.out.println("Now Enter the value upto which you want to print fibonacci series");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int c=0;   //sum in start is 0
        int sum=0;
        while(c<=n){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
           sum=sum+c;
        }
        System.out.println("the sum is above fibonacci series is " + sum);
    }
}
