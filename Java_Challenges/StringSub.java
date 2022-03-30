package Java_Challenges;

import java.util.*;

public class StringSub {
    public static boolean is_str_contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("You can't pass null strings as input.");
        }
        boolean ans = false;
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = 0; j < str2.length(); j++) {
                    if ((i + j) < str1.length() && str2.charAt(j) == str1.charAt(i + j) && j == str2.length() - 1) {
                        ans = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Input second string: ");
        String str2 = scanner.nextLine();
        System.out.println("If the first string contains the second one? "+is_str_contains(str1, str2));
    }
}