public class SimpleCalculator {
    public static double calculate(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b != 0 ? a / b : Double.NaN;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 5, '+')); // Output: 15.0
        System.out.println(calculate(10, 5, '/')); // Output: 2.0
    }
}
