package Assignment_Level_1;

import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String original = sc.next();
        original = original.toLowerCase();

        // Reverse String using StringBuilder
        StringBuilder reverseString = new StringBuilder(original);

        // reverseString StringBuilder reverseString
        reverseString.reverse();

        // converting StringBuilder into String
        String rev = reverseString.toString();

        // check and print if both string are equals using equals method
        System.out.println(original +" is palindrome-- "+ original.equals(rev));
    }
}
