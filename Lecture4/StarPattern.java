public class StarPattern {
    public static void main(String[] args) {
        int n = 4;
        char star = '*';
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n; j++) { // inner loop
                System.out.print(star + " "); // print square pattern of stars
            }
            System.out.println();
        }
    }
}
