package Assignment_2;
//Perimeter Of Circle
import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int radius = in.nextInt();
        float P = (2* 3.14f * radius);
        System.out.println("Perimeter Of Circle is " + P);
    }
}

