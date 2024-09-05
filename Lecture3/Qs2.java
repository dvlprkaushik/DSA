import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " is = " + sum);
        sc.close();
    }
}
