package Assignment_1;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number");
        int a = input.nextInt();
        int i=a;
        int num=i;
        int sum=0;
        while(num>0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
            if(sum==i){
                System.out.println("Armstrong no.");
            }
            else{
                System.out.println("Not Armstrong");
            };
        }
    }


