package String_Assignments;

import java.util.Scanner;

// Java program to check if a string contains only digits
public class StringOnlyDigits {

    // method to check if a string contains only digits
    public static boolean onlyDigits(String str, int n)
    {
        // Traverse the string from start to end
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str.charAt(i)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        // String Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :: ");
        String str = sc.nextLine();

        // method call
        System.out.println("The String contains only digits :: " +onlyDigits(str, str.length()));
    }
}
