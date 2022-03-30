package Java_Challenges;

import java.util.Scanner;

public class AsciiValue {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a character to find it's ascii value: ");
            char ch = scan.next().charAt(0);
            // You can also cast char to int
            int ascii = (int)ch ;

            System.out.println("The ASCII value of " + ch + " is: " + ascii);
        }

}
