import java.util.Scanner;
public class main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Corrected "canner" to "Scanner"
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;

            // Loop to check for divisors
            for (int i = 2; i < n; i++) { // Changed "i <= n-1" to "i < n"
                if (n % i == 0) {
                    isPrime = false;
                    break; // Break the loop as soon as a divisor is found
                }
            }

            // Print results based on isPrime value
            if (isPrime) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
 }
    
}
    }
}