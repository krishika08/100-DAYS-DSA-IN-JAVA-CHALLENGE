import java.util.*;
public class PRIMEorNOT{
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in); // Corrected "canner" to "Scanner"
int n = sc.nextInt();

boolean isPrime = true;
if (n == 2) {
    System.out.println("n is prime");
} else {
    

   // Loop to check for divisors
   for (int j = 2; j < n; j++) { // Changed "i <= n-1" to "i < n"
        if (n % j == 0) {
            isPrime = false;
           break; // Break the loop as soon as a divisor is found
        }
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
