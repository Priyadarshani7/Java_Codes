package Assignment_2;

import java.util.Scanner;

//Area Of Rhombus
public class program_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter diagonal1 and diagonal2");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        float A = ((d1 * d2)/2);
        System.out.println("Area Of Parallelogram is " + A);
    }
}
