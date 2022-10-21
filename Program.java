import java.util.Scanner;

public class Program {
    static int sequencialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == x) {
                return m;
            } else if (arr[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    static int ternarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1, bottomThird, topThird;
        while (l <= r) {
            bottomThird = (r - l) / 3;
            topThird = r - bottomThird;
            if (arr[bottomThird] == x) {
                return bottomThird;
            }
            if (arr[topThird] == x) {
                return topThird;
            }
            if (x < arr[bottomThird]) {
                r = bottomThird - 1;
            } else if (x > arr[topThird]) {
                l = topThird + 1;
            } else {
                l = bottomThird + 1;
                r = topThird - 1;
            }
        }
        return -1;
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        boolean swap = true;
        int end = arr.length - 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            end--;
        }
    }

    static int gcd(int m, int n) {
        if (m == n) {
            return m;
        }
        if (m > n) {
            return gcd(n, m - n);
        }
        return gcd(n, m);
    }

    static int power(int b, int e) {
        if (e == 0) {
            return 1;
        }
        if (e == 1) {
            return b;
        }
        return b * power(b, e - 1);
    }

    static void printTriangle(int n) {
        if (n < 1) {
            return;
        }
        printTriangle(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void patternGenerator(int n, int k, String s) {
        if (n == 0 && k == 0) {
            System.out.println(s);
        }
        if (n != 0 && k != 0) {
            patternGenerator(n - 1, k - 1, s + '1');
            patternGenerator(n - 1, k, s + '0');
        }
        if (n != 0 && k == 0) {
            patternGenerator(n - 1, k, s + '0');
        }
    }

    static void permuteString(String s) {
        permuteString("", s);
    }

    static void permuteString(String before, String after) {
        if (after.length() == 0) {
            System.out.println(before);
        }
        else {
            for (int i = 0; i < after.length(); i++) {
                permuteString(before + after.charAt(i), after.substring(0, i) + after.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        permuteString("abcd");
    }
}