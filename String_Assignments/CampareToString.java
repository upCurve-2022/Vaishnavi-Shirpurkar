package String_Assignments;

import java.util.Scanner;

public class CampareToString{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 :: ");
        String str1 = sc.nextLine();

        System.out.print("Enter a String 2 :: ");
        String str2 = sc.nextLine();

        System.out.println("Are the two strings equal? (using equals() method)");
        boolean result = str1.equals(str2);
        System.out.println(result);

        System.out.println("Are the two strings equal? (Comparing by using == )");
        result = str2 == str2;
        System.out.println(result);

        System.out.println("Are the two strings equal? (using compareTo() method)");
        System.out.println((str1.compareTo(str2)) == 0 ? "Strings are equals" : "String are not equals");
    }
}