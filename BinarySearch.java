import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] list, int item) {
        int l = 0, r = list.length - 1, m;
        Arrays.sort(list);

        while (l <= r) {
            m = (l + r) / 2;
            if (list[m] == item) {
                return m;
            }
            else if (item > list[m]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static int binarySearchString(String[] list, String item) {
        int l = 0, r = list.length - 1, m;
        Arrays.sort(list);

        while (l <= r) {
            m = (l + r) / 2;
            if (list[m].equals(item)) {
                return m;
            }
            else if (item.compareTo(list[m]) > 0) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static int binarySearchDescending(int[] list, int item) {
        int l = 0, r = list.length - 1, m;

        while (l <= r) {
            m = (l + r) / 2;
            if (list[m] == item) {
                return m;
            }
            else if (item < list[m]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static int binarySearchNearest(int[] list, int item) {
        int l = 0, r = list.length - 1, m;

        while (l <= r) {
            m = (l + r) / 2;
            if (list[m] == item) {
                return m;
            }
            else if (item < list[m]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        if (item - list[l] < item - list[r]) {
            return list[l];
        }
        return list[r];
    }

    public static void main(String[] args) {
        int[] intlist = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] stringlist = {"A", "C", "B", "D", "E"};
        System.out.println(binarySearch(intlist, 6));
        System.out.println(binarySearchString(stringlist, "B"));
    }
}