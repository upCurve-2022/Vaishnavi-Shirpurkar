package String_Assignments;

import java.util.Scanner;

public class DeleteAllCharOcc {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("\nPlease Enter String to Delete All Characters =  ");
        String delChar = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        System.out.print("\nEnter the Character to Delete =  ");
        char ch = sc.next().charAt(0);

        char[] delCharArr = delChar.toCharArray();

        for(int i = 0; i < delCharArr.length; i++) {
            if(delCharArr[i] != ch) {
                stringBuilder.append(delCharArr[i]);
            }
            else{
                continue;
            }
        }

        System.out.print("\nThe Final String after Deleting " +
                ch + " Character :: " );
        System.out.print(stringBuilder.toString());
    }
}