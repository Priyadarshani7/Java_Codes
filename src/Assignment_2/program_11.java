package Assignment_2;

import java.util.Scanner;

//Perimeter Of Rectangle
public class program_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and width");
        int l = in.nextInt();
        int w = in.nextInt();
        float P = (2*l + 2 *w);
        System.out.println("Perimeter Of Rectangle is " + P);
    }
    }

