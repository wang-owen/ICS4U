public class InsertionSort {
    public static void insertionSortSimple(int[] arr) {
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

    public static void insertionSortPlanets(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int median(int[] arr) {
        boolean found = false;
        for (int i = 1; i < arr.length && !found; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j] = key;
                j--;
            }
            arr[j + 1] = key;
            if (i == arr.length / 2) {
                found = true;
            }
        }
        return arr[arr.length / 2];
    }


    public static void main(String args[]) {
    }
}