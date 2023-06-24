package Assignment_2;
//Perimeter Of Rhombus
import java.util.Scanner;

public class program_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = in.nextInt();
        float P = (4 * side);
        System.out.println("Perimeter Of Rhombus is " + P);
    }
}