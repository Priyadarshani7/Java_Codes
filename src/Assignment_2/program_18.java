package Assignment_2;

import java.util.Scanner;

//Volume Of Pyramid
public class program_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = in.nextInt();
        System.out.println("Enter the width");
        int w = in.nextInt();
        System.out.println("Enter the pyramid height");
        int h = in.nextInt();
        float V = (l*w*h)/3;
        System.out.println("Volume of Pyramid is " + V);
    }
}



