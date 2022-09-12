import java.util.*;

public class G11Review1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, x, sum = 0;

        System.out.print("Enter 3-digit number: ");
        num = sc.nextInt();
        x = num;

        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }

        System.out.println("\nGiven digit: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}