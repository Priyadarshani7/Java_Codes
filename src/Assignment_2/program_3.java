package Assignment_2;

import java.util.Scanner;

//Area Of Rectangle Program
public class program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of length and breath");
        int length = input.nextInt();
        int breath = input.nextInt();
        float A = (length*breath);
        System.out.println("The Area of Rectangle is " + A);

    }
}
