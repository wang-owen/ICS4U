public class BubbleSort {
    public static void bubbleSort(int arr[]) {
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

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 7, 6, 12, 40 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
