package Assignment_Level_1;

public class Pyramid_One {
    void printPyramid(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Pyramid_One p1 = new Pyramid_One();
        p1.printPyramid(5);
    }
}
