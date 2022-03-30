package Assignment_Level_1;

import java.util.*;

public class FindLargest {
    static void find(Integer[] a, int size){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        System.out.println("Largest: " +list.get(size-1));
        System.out.println("Second Largest: " +list.get(size-2));
    }
    public static void main(String args[]){
        Integer[] arr = new Integer[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        find(arr, 3);
    }
}
