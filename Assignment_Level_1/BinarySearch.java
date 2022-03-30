package Assignment_Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last) / 2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }
            else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String a[]){
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = in.nextInt();
        array = new int[n];
        Arrays.sort(array);
        System.out.println("Enter those " + n + " elements: ");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.print("Enter value to find: ");
        search = in.nextInt();

        binarySearch(array, 0, array.length - 1 , search);
    }
}

