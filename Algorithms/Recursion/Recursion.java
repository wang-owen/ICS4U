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
    
    public static int largest(int[] arr) {
        return largest(arr, 0, arr.length - 1);
    }

    private static int largest(int[] arr, int start, int end) {
        if (start >= end) {
            return arr[start];
        }
        if (arr[start] < arr[end]) {
            return largest(arr, start + 1, end);
        }
        return largest(arr, start, end - 1);
    }

    public static int binarySearch(int[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int x, int l, int r) {
        int m = (l + r) / 2;
        while (l <= r) {
            if (arr[m] == x) {
                return m;
            }
            if (x > arr[m]) {
                return binarySearch(arr, x, m + 1, r);
            }
            else {
                return binarySearch(arr, x, l, m - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}