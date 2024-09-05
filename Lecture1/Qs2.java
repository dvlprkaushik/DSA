// Greater among two ?

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        int numOne, numTwo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num 1 = ");
        numOne = input.nextInt();
        System.out.print("Enter num 2 = ");
        numTwo = input.nextInt();

        if(numOne>numTwo){
            System.out.println("Num 1 is greater");
        }else{
            System.out.println("Num 2 is greater");
        }
        input.close();
    }
}
