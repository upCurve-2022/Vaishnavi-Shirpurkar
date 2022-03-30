package Java_Challenges;

public class StringReplace {

    public static void main(String args[]){

        String str = "I am always ready to learn although I do not always like being taught.";
        //replaces all occurrences of 'a' to '$'
        String replaceString = str.replace('a','$');
        System.out.println("Original String :: " +str + "\nReplace String :: " +replaceString);
    }
}