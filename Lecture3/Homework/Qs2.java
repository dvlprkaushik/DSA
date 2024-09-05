package Homework;

// Print Factorial of a number N.

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        int N, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N = ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + N + " is = " + fact);
        sc.close();
    }
}
