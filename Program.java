public class Program {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int k = i - 1;

            while (k >= 0 && arr[k] > val) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = val;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public static void cocktailSort(int[] arr) {
        boolean swap = true;
        int start = 0, end = arr.length - 1;
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
            if (swap) {
                swap = false;
                end--;
                for (int i = end - 1; i < start - 1; i--) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swap = true;
                    }
                }
                start++;
            }
        }
    }

    public static void shakeSort(int[] array) {
        boolean isSorted = false, isAscending = true;
        int temp;

        for (int i = array.length - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            if (isAscending) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        isSorted = false;
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            } else {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        isSorted = false;
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }

            isAscending = !isAscending;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 4, 3, 6, 8, 7, 2, 5, 9 };
        insertion(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
