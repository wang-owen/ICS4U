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
            }
            else if (arr[m] > x) {
                r = m - 1;
            }
            else {
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
            }
            else if (x > arr[topThird]) {
                l = topThird + 1;
            }
            else {
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
        int j = 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    j++;
                    swap = true;
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}