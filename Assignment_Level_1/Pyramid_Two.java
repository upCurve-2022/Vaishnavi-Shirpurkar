package Assignment_Level_1;

public class Pyramid_Two {
    void starPyramid(int n){
        for(int i = 1; i <= n; i++){

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Pyramid_Two p2 = new Pyramid_Two();
        p2.starPyramid(5);
    }
}
