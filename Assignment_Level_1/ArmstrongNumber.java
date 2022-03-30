package Assignment_Level_1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        int temp, rem, sum = 0;
        System.out.println("Enter the number to be verified:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        temp = number;
        while(temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if(sum == number)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
    }
}