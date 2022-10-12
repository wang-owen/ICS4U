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

    public static void printRow(int n) {
        if (n < 1) {
            return;
        }
        System.out.print("*");
        printRow(n - 1);
    }

    public static void printTriangle(int n) {
        if (n < 1) {
            return;
        }
        printTriangle(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static int largest(int[] list) {
        return largest(list, 0, list.length);
    }

    public static int largest(int[] list, int start, int end) {
        if (start - end == 1) {
            return list[start];
        }
        if (list[start] < list[end]) {

        }
    }


    public static void main(String[] args) {
        printTriangle(5);
    }
}