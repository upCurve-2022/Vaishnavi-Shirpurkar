package Assignment_Level_1;

import java.util.Scanner;

public class FourthSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for (int i = 2; i <= N; i = i + 2) {
            System.out.print((i * i) + " ");
        }
    }
}
