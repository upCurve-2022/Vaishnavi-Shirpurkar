package Assignment_Level_1;

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to be reversed: ");
        String input = sc.next();

        // Reverse String using StringBuilder
        StringBuilder input1 = new StringBuilder(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println("Reverse String: " +input1);
    }
}
