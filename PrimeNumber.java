public class PrimeNumber {

        public static void main(String[] args) {
            int limit = 100; // You can change this limit to any number you want
    
            System.out.println("Prime numbers up to " + limit + " are:");
            for (int num = 2; num <= limit; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    
        // Method to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
        
    }
}
    

