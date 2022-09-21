import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.printf("Sum: %d", sum);
    }
}
