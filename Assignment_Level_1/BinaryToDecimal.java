package Assignment_Level_1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        // using toBinaryString method of Integer class
        System.out.println("Decimal number is: " +getDecimal(binary));
    }
}
