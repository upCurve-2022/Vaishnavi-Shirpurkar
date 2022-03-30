package Assignment_Level_1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        // using toBinaryString method of Integer class
        System.out.println("Binary is: " +Integer.toBinaryString(decimal));
    }
}
