package Assignment_2;

import java.util.Scanner;

//Area Of Parallelogram
public class program_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height");
        int base = in.nextInt();
        int height = in.nextInt();
        float A = (base * height);
        System.out.println("Area Of Parallelogram is " + A);
    }
}
