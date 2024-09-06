public class TrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        // with stars
        char star = '*';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }

        // with numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // with characters
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(letter);
            }
            letter++;
            System.out.println();
        }
    }
}
