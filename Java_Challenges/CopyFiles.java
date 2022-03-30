package Java_Challenges;

// Java program to copy content from
// one file to another

import java.io.*;
import java.util.*;

public class CopyFiles {

    public static void copyContent(File a, File b) throws Exception {

        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {
            int n;

            // read() function to read the byte of data
            while ((n = in.read()) != -1) {
                // write() function to write the byte of data
                out.write(n);
            }
        }
        finally {
            if (in != null) {

                // close() function to close the stream
                in.close();
            }
            // close() function to close the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        // get the source file name
        System.out.print("Enter the source filename from where you have to read/copy ::");
        String fileA_name = sc.nextLine();

        // source file
        File fileA = new File(fileA_name);

        // get the destination file name
        System.out.print("Enter the destination filename where you have to write/paste ::");
        String fileB_name = sc.nextLine();

        // destination file
        File fileB = new File(fileB_name);

        // method called to copy the contents from x to y
        copyContent(fileA, fileB);
    }
}

