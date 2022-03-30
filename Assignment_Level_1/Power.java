package Assignment_Level_1;

import java.util.Scanner;

public class Power {
    // Function to calculate x raised to the power P
    static int power(int x, int n)
    {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter value of N (Power): ");
        int n = sc.nextInt();

        // calling power method
        System.out.println("Output: " +power(x, n));
    }
}
