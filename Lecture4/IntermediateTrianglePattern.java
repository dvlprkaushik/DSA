public class IntermediateTrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        // Reverse Triangle pattern with numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Reverse Triangle pattern with characters
        char A = 'A';
        for (int i = 0; i < n; i++) {
            char temp = (char) (A + i);
            for (int j = i + 1; j > 0; j--) {
                System.out.print(temp + " ");
                temp--;
            }
            System.out.println();
        }

        // Floyd's Triangle Pattern with numbers
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Floyd's Triangle Pattern with characters
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // Inverted Triangle Pattern of numbers
        char spaces = ' ';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(spaces);
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        // Inverted Triangle Pattern of characters
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print(letter);
            }
            letter++;
            System.out.println();
        }

    }
}
