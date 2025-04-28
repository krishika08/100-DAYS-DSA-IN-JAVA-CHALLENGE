public class smallest {
    public static void main(String[] args) {
        int[][] matrix = { { 3, 8, 1 }, { 7, 2, 9 }, { 4, 6, 5 } };
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }

        System.out.println("Smallest element: " + min);
    }
}
