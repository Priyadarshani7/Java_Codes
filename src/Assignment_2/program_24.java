package Assignment_2;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class program_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int sum = 0;
        int n = in.nextInt();
        while(n!=0){
            sum = sum + n;

            n= in.nextInt();
        }
        System.out.println(sum);
    }
}
