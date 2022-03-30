package Java_Challenges;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // input array size.
        System.out.print("Enter size of an array: ");
        int size = s.nextInt();
        // create an array
        int[] array = new int[size];

        // input array values
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            array[i] = value;
        }
        // getting array length
        int length = array.length;

        // default sum value.
        double sum = 0;

        // sum array values using for loop
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        // average
        double average = sum / length;
        System.out.println("Sum of array:: " + sum);
        System.out.printf("Average of array:: %.2f " , average);
    }
}