import java.util.*;

public class Division {
    public static void main(String[] args) {
        boolean run = true;
        double numerator = 0, divisor = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter the numerator: ");
                numerator = sc.nextDouble();
                System.out.print("Enter the divisor: ");
                divisor = sc.nextDouble();

                if (divisor == 0) {
                    System.out.printf("You can't divide %f by 0\n", numerator);
                } else {
                    System.out.printf("%f / %f is %f\n\n", numerator, divisor, numerator / divisor);
                }
            } catch (InputMismatchException e) {
                if (sc.nextLine().charAt(0) == 'q') {
                    run = false;
                } else {
                    System.out.println("You entered bad data");
                    System.out.println("Try again\n");
                }
            }
        } while (run);
        sc.close();
    }
}
