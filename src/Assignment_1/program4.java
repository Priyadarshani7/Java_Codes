package Assignment_1;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a");
        float a = input.nextFloat();
        System.out.println("enter b");
        float b = input.nextFloat();
        System.out.println("chose opeartor (+, -, *, /)");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            float sum = a + b;
            System.out.println(sum);
        } else if(operator== '-') {
            float sub = a - b;
            System.out.println(sub);

        }else if(operator== '*'){
            float mul = a*b;
            System.out.println(mul);
        }
        else {
            float div = a/b;
            System.out.println(div);
        }

    }
}


