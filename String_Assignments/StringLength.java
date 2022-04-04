package String_Assignments;

import java.util.Scanner;

public class StringLength {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :: ");
        String str = sc.nextLine();

        // string length using inbuilt function
        System.out.println("String length using inbuilt function >> The size of the String is " + str.length());

        // String length without using inbuilt function
        char[] strArr = str.toCharArray();
        int count = 0;
        for(int i = 0; i < strArr.length; i++){
            count ++;
        }
        System.out.println("String length without using inbuilt function >> The size of the String is " + str.length());
    }
}
