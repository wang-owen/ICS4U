public class BubbleSort {
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

    static void cocktailSort(int arr[]) {
        boolean swap = true;
        int start = 0;
        int end = arr.length - 1;

        while (swap) {
            swap = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            if (swap) {
                swap = false;
                for (int i = end; i >= start + 1; i--) {
                    if (arr[i] < arr[i - 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                        swap = true;
                    }
                }
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 9, 1, 8, 3, 2, 10, 5, 4, 7 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
