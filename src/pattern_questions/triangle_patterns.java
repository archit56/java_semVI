package pattern_questions;

public class triangle_patterns {
    public static void main(String[] args) {
//        inverse_half_right_tri(5);
//        half_right_kite(5);
        full_kite(5);
    }

    public static void inverse_half_right_tri(int rows) {
        int var = 2;
        int z;
        for(rows = 5; rows >= 1; rows--) {
            for(int col = rows; col >= 1; col--) {
                z = var%2;
                var++;
                System.out.print(z);
            }
            System.out.println();
        }
    }

    public static void half_right_kite(int N) {
        int numOfCol;
        for(int rows = 1; rows <= 2*N; rows++) {
            numOfCol = rows <= N ? numOfCol = rows : 2*N - rows;
            for (int col = 1; col <= numOfCol; col++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void full_kite(int N) {
        int numOfStars;
        int numofSpaces;
        for(int i = 1; i <= 2*N - 1; i++) {
            for(int j = 1; j <= N; j++) {
                numOfStars = (i <= N) ? numOfStars = i : 2*N - i;
                numofSpaces = N - numOfStars;

            }
        }
    }
}
