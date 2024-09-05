import java.util.Scanner;

// Find character lowercase or uppercase.

public class Qs1 {
    public static void main(String[] args) {
        char c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character : ");
        c = sc.next().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Lowercase");
        }
        sc.close();
    }
}