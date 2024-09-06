public class PyramidPattern {
    public static void main(String[] args) {
        int n = 10;
        char spaces = ' ';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(spaces);
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
