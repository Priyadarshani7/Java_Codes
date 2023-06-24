package Assignment_2;

import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class program_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }

        }
    }

}
