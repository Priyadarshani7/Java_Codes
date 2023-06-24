package Assignment_2;

import java.util.Scanner;
//Perimeter Of Equilateral Triangle
public class program_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = in.nextInt();
        float P = (3*side);
        System.out.println("Perimeter Of Equilateral Triangle is " + P);
    }
}
