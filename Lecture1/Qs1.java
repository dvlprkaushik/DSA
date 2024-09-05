// Area of square ?
 
import java.util.Scanner;

public class Qs1{
    public static void main(String[] args) {
        int side ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of square = ");
        side = input.nextInt();
        System.out.println("Area of square = " + side*side);
        input.close();
    }
}