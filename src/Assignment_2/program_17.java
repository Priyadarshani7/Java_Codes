package Assignment_2;

import java.util.Scanner;
//Volume Of Sphere
public class program_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = in.nextInt();
        float V = (4 * 3.14f * r * r *r)/3;
        System.out.println("Volume of Sphere is " + V);
    }
}

