package Assignment_Level_1;

import java.util.Scanner;

public class NPowerSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print((int) Math.pow(i,i) + " ");
        }
    }
}
