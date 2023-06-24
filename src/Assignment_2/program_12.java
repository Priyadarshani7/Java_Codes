package Assignment_2;

import java.util.Scanner;
//Perimeter Of Square
public class program_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = in.nextInt();
        float P = (4 * side);
        System.out.println("Perimeter Of Square is " + P);
    }
}