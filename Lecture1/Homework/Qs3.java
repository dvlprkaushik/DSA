package Homework;

import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        int N, fact = 1;
        System.out.print("Enter Number = ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        System.out.println("Factorial is = " + fact);
        sc.close();
    }
}
