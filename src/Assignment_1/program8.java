package Assignment_1;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not
public class program8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.next();
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                System.out.println("The given String is not Palindrome");
                System.exit(0);
            }
            a++;
            b--;
        }
        System.out.println("It is a Palindrome String");
    }
}
