package Assignment_Level_1;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements: ");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.print("Enter value to find: ");
        search = in.nextInt();

        int key = linearSearch(array, search);
        if(key == -1)
            System.out.println(search+ " isn't present in array");
        else
            System.out.println(search+" is found at index: "+(linearSearch(array, search) + 1));
    }
}

