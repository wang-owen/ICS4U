public class SequentialSearch {
    public static int seqSearch(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static int seqSearch2(int[] list, int item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int interchange(int[] list, int item) {
        int t;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                t = list[i - 1];
                list[i - 1] = item;
                list[i] = t;
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}