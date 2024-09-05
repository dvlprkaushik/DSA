package Homework;

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 = ");
        num1 = input.nextInt();
        System.out.println("Enter num2 = ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("Num 1 is greater");
        } else {
            System.out.println("Num 2 is greater");
        }
        input.close();
    }
}
