// Sum of numbers from 1 to N

import java.util.Scanner;

public class Qs4 {
    public static void main(String[] args) {
        int num,sum = 0;
        Scanner run = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = run.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of "+num+" natural numbers are = "+sum);
        run.close();
    }
}
