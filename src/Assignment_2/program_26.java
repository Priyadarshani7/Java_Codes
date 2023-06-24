package Assignment_2;

import java.util.Scanner;

//Addition Of Two Numbers
public class program_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum = n1+n2;
        System.out.println("Addition Of Two Numbers " + sum);
    }
}
