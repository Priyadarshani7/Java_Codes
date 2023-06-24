package Assignment_2;

import java.util.Scanner;

//Perimeter Of Parallelogram
public class program_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and side");
        int base = in.nextInt();
        int side = in.nextInt();
        float P = (2*base + 2 *side);
        System.out.println("Perimeter Of Parallelogram is " + P);
    }
}
