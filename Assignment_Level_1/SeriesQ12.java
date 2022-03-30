package Assignment_Level_1;

import java.util.Scanner;

public class SeriesQ12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int arr[] = new int[N];
        int j = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
            }
            else {
                arr[j] = i * -1;
            }
            j++;
        }
        for(int m = 0; m < N; m++) {

            System.out.print(arr[m] + " ");
        }
    }
}
