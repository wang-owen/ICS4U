import java.util.Random;
import java.util.Scanner;

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
        int n;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(1, 50);
        }

        System.out.println(seqSearch2(list, 10));

        do {
            System.out.println("\nEnter int (0 to quit): ");
            n = sc.nextInt();
            System.out.println("Index: " + interchange(list, n));
        } while (n != 0);
        sc.close();
    }
}