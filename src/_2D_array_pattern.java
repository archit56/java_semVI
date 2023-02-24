public class _2D_array_pattern {
    public static void main(String[] args) {

        int n = 5;

        int[][] arr = new int[n][];

        for(int i = 0; i < n; i++) {
            arr[i] = new int[i+1];
        }

        int col;
//        k = 0;

        for(int i = 0, k = 0; i < n; i++) {
            for (col = 0; col < arr[i].length; col++, k++) {
                arr[i][col] = k%2;
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
