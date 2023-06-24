package Assignment_2;

import java.util.Scanner;

//Fibonacci Series In Java Programs
public class program_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print fibonacci series");
        int n = input.nextInt();
        int a =0;
        int b =1;
        int c =0;
        while(c<=n){
            System.out.println(c);
            a=b;
            b=c;
           c=a+b;

        }

    }


}

