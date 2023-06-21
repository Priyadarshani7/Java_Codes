package Assignment_1;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int num = input.nextInt();
        if(num% 2==0){
            System.out.println("number is even");
        }
        else System.out.println("number is false");
    }
}