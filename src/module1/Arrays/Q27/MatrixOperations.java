package module1.Arrays.Q27;

public class MatrixOperations {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4} };

        int[][] b = { {5, 6},{7, 8} };

        System.out.println("Matrix Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Multiplication:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                int sum = 0;

                for (int k = 0; k < 2; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }   
}
