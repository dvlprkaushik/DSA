package Homework;

// Sum of all numbers from 1 to N which are divisible by 3

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {
        int N,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        N = sc.nextInt();
        for(int i = 1 ; i <= N; i++){
            if(i%3==0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all numbers are = "+sum);
        sc.close();
    }
}
