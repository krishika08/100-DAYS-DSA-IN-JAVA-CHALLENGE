import java.util.*;

public class Functions {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        return;
    }
    // public static int CalculateSum(int num1,int num2){
    //     int sum = num1 + num2;
    //     return sum;
    // }
    public static int multiply(int a,int b){
        int product = a * b;
        return product;
    }
    
    
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b = " + prod);
    

        // printHelloWorld();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = CalculateSum(a,b);
        // System.out.println("sum is : "+ sum);
        System.out.println(factorial(8));
    }

}

