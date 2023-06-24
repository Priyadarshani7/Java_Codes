package Assignment_2;
//Total Surface Area Of Cube
import java.util.Scanner;

public class program_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        int a = in.nextInt();
        float TSA = (6*a*a);
        System.out.println("Total Surface Area Of Cube is " + TSA);
    }
}
