public class LetterPattern {
    public static void main(String[] args) {
        int n = 4;
        char letter = 'A';
        char temp = letter;
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n; j++) { // inner loop
                System.out.print(temp + " "); // letter pattern
                temp++;
            }
            temp = letter;
            System.out.println();
        }
    }
}
