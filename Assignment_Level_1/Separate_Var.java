package Assignment_Level_1;

import java.util.Scanner;

public class Separate_Var {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Double Value: ");
        double num = sc.nextDouble();
        int intValue = (int) num;
        float fractionValue = (float) (num - intValue);
        System.out.println("Double Number: " + num);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Fraction Value: " + fractionValue);
    }
}
