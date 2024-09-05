// Check if a number is prime or not

public class Qs4 {
    public static void main(String[] args) {
        int n = 10;
        boolean isPrime = true;
        for (int i = 2; i < (n / 2); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("is a prime number");
        } else {
            System.out.println("is not a prime number");
        }
    }
}
