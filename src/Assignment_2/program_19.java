package Assignment_2;

import java.util.Scanner;

//Curved Surface Area Of Cylinder
    public class program_19 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the radius");
            int r = in.nextInt();
            System.out.println("Enter the height");
            int h = in.nextInt();
            float CSA = (2*3.14f*r*h);
            System.out.println("Curved Surface Area Of Cylinder is " + CSA);
        }
    }


