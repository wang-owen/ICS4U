import java.util.Scanner;

public class RecursionPermutation {
    public static void permuteAlphabet(int n) {
        permuteAlphabet(n, "");
    }

    private static void permuteAlphabet(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i <= n; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                permuteAlphabet(n - 1, s + c);
            }
        }
    }

    public static void patternGenerator() {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println("The bit patterns are");
            patternGenerator(n, k, "");
        }
        sc.close();
    }

    private static void patternGenerator(int n, int k, String s) {
        if (n == 0 && k == 0) {
            System.out.println(s);
        } else if (n != 0 && k != 0) {
            patternGenerator(n - 1, k - 1, s + '1');
            patternGenerator(n - 1, k, s + '0');
        } else if (n != 0 && k == 0) {
            patternGenerator(n - 1, k, s + '0');
        }
    }

    public static void main(String[] args) {
    }
}
