package Java_Challenges;

import java.io.FileOutputStream;
import java.util.Scanner;
public class WriteInFile
{
    public static void main(String args[])
    {
        try
        {
            // file name as input
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String fileName = sc.nextLine();

            // true for append mode
            FileOutputStream fos = new FileOutputStream(fileName, true);
            System.out.print("Enter file content: ");

            //str stores the string which we have entered
            String str=sc.nextLine()+"\n";

            //converts string into bytes
            byte[] b= str.getBytes();

            //writes bytes into file
            fos.write(b);

            //close the file
            fos.close();
            System.out.println("Data saved in file.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}