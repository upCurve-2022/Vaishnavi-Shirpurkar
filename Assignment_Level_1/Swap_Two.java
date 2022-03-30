package Assignment_Level_1;

import java.util.Scanner;

public class Swap_Two {
    void swap(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping numbers: " +x +" " +y);
    }
    public static void main(String args[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before swapping numbers are: " +x +" " +y);
        Swap_Two s1 = new Swap_Two();
        s1.swap(x,y);
    }
}
