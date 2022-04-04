package String_Assignments;

import java.util.Scanner;

public class EmptyStringCheck {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to check it is empty or not: ");
        String str = scanner.nextLine();

        if(str.isEmpty())
            System.out.println("String is empty!");
        else
            System.out.println("String is not empty.");
    }
}