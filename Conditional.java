    import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        // 1. Vote & Drive Check
        int age = 22;
        if (age > 10) {
            System.out.println("vote, drive");
        } else {
            System.out.println("not adult");
        }

        // 2. Largest of Two Numbers
        int a = 10, b = 20;
        if (a >= b) {
            System.out.println("a is the largest of 2");
        } else {
            System.out.println("b is the largest of 2");
        }

        // 3. Even or Odd Check
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        // 4. Else-if Statements
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("adult");
        } else if (age2 >= 13 && age2 < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }

        // 5. Income Tax Calculator
        System.out.print("Enter income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is = " + tax);

        // 6. Largest of Three Numbers
        int x = 10, y = 12, z = 34;
        if (x >= y && x >= z) {
            System.out.println("x is the largest of 3");
        } else if (y >= z) {
            System.out.println("y is the largest of 3");
        } else {
            System.out.println("z is the largest of 3");
        }

        // 7. Ternary Operator
        int num = 4;
        String type = (num % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // 8. Student Pass or Fail
        int marks = 67;
        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);

        // 9. Switch Statements
        int foodChoice = 3;
        switch (foodChoice) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("pizza");
                break;
            case 4:
                System.out.println("macaroni");
                break;
            default:
                System.out.println("I wake up, ufffff I was dreaming !!!!");
        }

        // 10. Calculator
        System.out.print("Enter a: ");
        int num1 = sc.nextInt();

        System.out.print("Enter b: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator.");
        }

        // Close the scanner
        sc.close();
    }
}


