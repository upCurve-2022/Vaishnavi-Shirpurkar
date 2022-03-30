package Java_Challenges;

import java.util.Scanner;
public class CheckPerfectSquare
{
    //user-defined method that checks the number is perfect square or not
    static boolean checkPerfectSquare(double number)
    {
        //calculating the square root of the given number
        double sqrt=Math.sqrt(number);
        //finds the floor value of the square root and comparing it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();

        if (checkPerfectSquare(number))
            System.out.print("Yes, the given number is a perfect square.");
        else
            System.out.print("No, the given number is not a perfect square.");
    }
}
