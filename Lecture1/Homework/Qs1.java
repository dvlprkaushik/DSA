package Homework;

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {
        float SI, P, R, T;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the principal amount = ");
        P = user.nextFloat();
        System.out.print("Enter the rate of interest = ");
        R = user.nextFloat();
        System.out.print("Enter the time = ");
        T = user.nextFloat();

        SI = (P * R * T) / 100;
        System.out.println("The simple interest is = " + SI);
        user.close();
    }
}
