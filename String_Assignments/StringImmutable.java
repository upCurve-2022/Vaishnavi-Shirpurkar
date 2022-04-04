package String_Assignments;

public class StringImmutable {
    public static void main(String args[]){
        String s = "Target";
        //concat() method appends the string at the end
        s.concat(" Work somewhere You Love.");
        // will print Target only because strings are immutable objects
        System.out.println(s);

        // we need to But explicitly assign it to the reference variable
        s = s.concat(" Work somewhere You Love.");
        System.out.println(s);
    }
}