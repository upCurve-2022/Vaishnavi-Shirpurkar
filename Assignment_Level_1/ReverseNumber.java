package Assignment_Level_1;

import java.util.Scanner;

public class ReverseNumber {
    static long reverse(long num){
        long reverse = 0;
        while(num != 0){
            long remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        return reverse;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long number = sc.nextLong();
        System.out.println("Reverse Number: " +reverse(number));
    }
}
