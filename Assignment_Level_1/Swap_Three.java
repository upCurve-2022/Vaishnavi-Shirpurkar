package Assignment_Level_1;

import java.util.Scanner;

public class Swap_Three {
    void swap(int x, int y, int z){
        int temp;
        temp = x;
        x = y;
        y = z;
        z = temp;
        System.out.println("After Swapping numbers: " +x +" " +y +" " +z);
    }
    public static void main(String args[]){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x, y and z");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.println("Before swapping numbers are: " +x +" " +y +" " +z);
        Swap_Three s = new Swap_Three();
        s.swap(x,y,z);
    }
}
