public class SquarePattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n; j++) { // inner loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
