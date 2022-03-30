package Assignment_Level_1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n, firstTerm = 1, secondTerm = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
