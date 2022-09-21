import java.util.*;

public class Simple1DArray {
    public static void main(String[] args) {
        int n, x, sampleSum;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.printf("\nEnter %d integer(s):\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Integer %d: ", i+1);
            arr[i] = sc.nextInt();
        }

        x = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = x;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
            }
        }

        sampleSum = Arrays.stream(arr).sum();
        System.out.println(sampleSum);

        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }
    }
}