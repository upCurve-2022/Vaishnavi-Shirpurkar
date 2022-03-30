package Assignment_Level_1;

import java.util.Scanner;

public class EvenOdd_Sum {
    void sum(int num){
        int evenSum = 0, oddSum = 0;
        for(int i = 0; i <= num; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("Even Sum: " +evenSum);
        System.out.println("Odd Sum: " +oddSum);
    }
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Program to calculate the sum of odd and even number.\n" +"Enter N: ");
        x = sc.nextInt();
        EvenOdd_Sum o = new EvenOdd_Sum();
        o.sum(x);
    }
}
