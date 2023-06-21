package Assignment_1;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
public class program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of principal");
        float p = input.nextFloat();
        System.out.println("Enter value of time");
        float t = input.nextFloat();
        System.out.println("Enter value of rate");
        float r = input.nextFloat();
        float si = ((p*r*t)/100);
        System.out.println("si is" + si);
    }
}
