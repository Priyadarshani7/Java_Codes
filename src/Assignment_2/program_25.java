package Assignment_2;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class program_25 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter number");
            int largest_no = 0;
            int n = in.nextInt();
            while (n != 0) {
                n = in.nextInt();
                if (n > largest_no) {
                    largest_no = n;

                }

            }
        System.out.println("Largest number is " + largest_no);
        }
    }

