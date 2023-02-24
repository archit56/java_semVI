package pattern_questions;

public class isosceles_tri {
    public static void main(String[] args) {

        int initial_i = 1;
        int initial_j = 3;
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(initial_i == i && initial_j == j) {
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            initial_i++;
            initial_j--;
            System.out.println();
        }
    }
}
