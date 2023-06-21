package Assignment_1;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees");
        float currency = input.nextFloat();
        float usd = (currency/81.9449f);
        System.out.println("usd =" + usd );
    }
}
