package Assignment_Level_1;

import java.util.Scanner;

public class Factorial {
    // method to find factorial of given number
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int fact = 1;
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

