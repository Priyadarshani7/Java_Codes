package Assignment_2;

import java.util.Scanner;

//Volume Of Prism
public class program_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = in.nextInt();
        System.out.println("Enter the height");
        int h = in.nextInt();
        float V = (b*h);
        System.out.println("Volume of Prism is " + V);
    }
}