public class Recursion {
    public static void hanoi(int n, int start, int end) {
        if (n == 1) {
            System.out.println(start + " --> " + end);
        } else {
            int alt = 6 - (start + end);
            hanoi(n - 1, start, alt);
            System.out.println(start + " --> " + end);
            hanoi(n - 1, alt, end);
        }
    }

    public static int gcd(int m, int n) {
        if (m > n) {
            return gcd(n, m - n);
        } else if (m < n) {
            return gcd(n, m);
        }
        return m;
    }

    public static int square(int n) {
        if (n == 1) {
            return 1;
        } else {
            return square(n - 1) + 2 * n - 1;
        }
    }

    public static boolean prime(int n) {
        if (n > 0) {
            return prime(n, n - 1);
        }
        return false;
    }

    private static boolean prime(int n, int d) {
        if (d == 1) {
            return true;
        }
        if (n % d != 0) {
            return prime(n, d - 1);
        }
        return false;
    }

    public static int power(int n, int p) {
        if (p == 1) {
            return n;
        }
        return n * power(n, p - 1);
    }

    public static void main(String[] args) {
    }
}