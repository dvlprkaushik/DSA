public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 5;  
    
        // Upper part
        for (int i = 1; i <= n; i++) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n; i >= 1; i--) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
