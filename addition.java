public class addition {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5,4}, {3, 2, 1}};
        int[][] result = new int[3][3];

        // Performing addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Printing the result
        System.out.println("Matrix Addition Result:");
        for (int[] row : result) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}