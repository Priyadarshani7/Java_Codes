package Assignment_2;
//Volume Of Cylinder
import java.util.Scanner;

public class program_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = in.nextInt();
        System.out.println("Enter the height");
        int h = in.nextInt();
        float V = (3.14f * r * r * h);
        System.out.println("Volume of Cylinder is " + V);
    }
}