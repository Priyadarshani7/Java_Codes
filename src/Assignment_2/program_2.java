package Assignment_2;

import java.util.Scanner;

//Area Of Triangle
public class program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        int base = input.nextInt();
        int height = input.nextInt();
        float A =(0.5f * base * height);
        System.out.println("Area of Triangle is " + A);
    }
}
