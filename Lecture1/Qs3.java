// Even number ?

import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        int user;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number = ");
        user = number.nextInt();
        if(user%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        number.close();
    }
}
