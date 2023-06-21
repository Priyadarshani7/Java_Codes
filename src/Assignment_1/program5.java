package Assignment_1;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        float a = input.nextFloat();
        float b = input.nextFloat();
        if(a>b){
            System.out.println("Largest no is " + a);
        }
        else{
            System.out.println("Largest no is " + b);
        }
    }
}
