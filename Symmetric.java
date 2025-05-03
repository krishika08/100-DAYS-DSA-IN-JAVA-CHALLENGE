import java.util.Scanner;
public class Symmetric {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        if (rows != cols) {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        } else {
            boolean symmetric = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
                if (!symmetric) break;
            }
            if (symmetric) {
                System.out.println("The given matrix is symmetric.");
            } else {
                System.out.println("The given matrix is not symmetric.");
            }
        }
        sc.close();
    }
}

