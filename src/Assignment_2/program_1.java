package Assignment_2;

import java.util.Scanner;

//Area Of Circle Java Program
public class program_1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the value of radius");
        int r = input.nextInt();
        float pie = 3.14f;
        float A = (pie * r*r);
        System.out.println("The  area of circle is " + A);
    }
}
