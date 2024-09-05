import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorialRecursively(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long calculateFactorialRecursively(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * calculateFactorialRecursively(n - 1);
        }
    }
}
