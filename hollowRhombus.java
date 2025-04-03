public class hollowRhombus {
    public static void hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces for alignment
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Constructing the hollow rhombus pattern
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"); // Border stars
                } else {
                    System.out.print(" "); // Hollow space inside
                }
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        hollow_Rhombus(9); // Try it out with size 9
    }
}