import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int n = 14, t;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 14 integers:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        // method 1
        System.out.println("\nMethod 1:");
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr2[i] = arr[j];
        }

        for (int i : arr2) {
            System.out.print(i + " ");
        }

        // method 2
        for (int i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

        System.out.println("\n\nMethod 2:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
