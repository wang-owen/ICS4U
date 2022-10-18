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
        for (int i = 0; i < sc.nextInt(); i++) {
            patternGenerator(sc.nextInt(), sc.nextInt(), "");
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

    public static void t(int n, int k, String s) {
        if (n == 0) {
            if (k == 0) {
                System.out.println(s);
            }
            return;
        }
        t(n - 1, k - 1, s + '1');
        t(n - 1, k, s + '0');
    }

    public static void main(String[] args) {
    }
}
