import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        int x ;
        Scanner  sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x  ; j++) {
                 System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
