package Java_Challenges;

import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string :: ");
        String str = scan.nextLine();
        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: "+ strUpper);
    }
}