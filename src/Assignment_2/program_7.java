package Assignment_2;

import java.util.Scanner;

//Area Of Equilateral Triangle
public class program_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of side a");
        int a = in.nextInt();
        float A = (0.43301270189f * a * a);
        System.out.println("Area Of Equilateral Triangle is " + A);
    }
}