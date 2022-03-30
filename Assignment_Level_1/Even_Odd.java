package Assignment_Level_1;

import java.util.Scanner;

public class Even_Odd {
    void check(int num){
        if(num % 2 == 0)
            System.out.println(num +" is even number");
        else
            System.out.println(num +" is odd number");
    }
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer:");
        x = sc.nextInt();
        Even_Odd o = new Even_Odd();
        o.check(x);
    }
}
