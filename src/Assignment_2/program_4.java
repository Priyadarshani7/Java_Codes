package Assignment_2;

import java.util.Scanner;

//Area Of Isosceles Triangle
public class program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and height");
        int base = input.nextInt();
        int height = input.nextByte();
        float A=(3.14f * base * height);
        System.out.println("Area Of Isosceles Triangle is " + A);
    }
}
