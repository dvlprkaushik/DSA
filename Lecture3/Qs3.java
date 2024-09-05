import java.util.Scanner;

// Sum of all odd numbers from 1 to N

public class Qs3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all "+N+" odd numbers is = " + sum);
        sc.close();
    }
}
