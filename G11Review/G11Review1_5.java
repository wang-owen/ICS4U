import java.util.*;

public class G11Review1_5 {
    public static void main(String[] args) {
        double PRICE_BURGERS = 1.69, PRICE_FRIES = 1.09, PRICE_SODAS = 0.99, total = 0, cash;
        double PST = 0.08, GST = 0.05;
        int burgers, fries, sodas;
        Scanner sc = new Scanner(System.in);

        // prompt user
        System.out.print("Enter number of burgers: ");
        burgers = sc.nextInt();
        System.out.print("Enter number of fries: ");
        fries = sc.nextInt();
        System.out.print("Enter number of sodas: ");
        sodas = sc.nextInt();

        total += (burgers * PRICE_BURGERS) + (fries * PRICE_FRIES) + (sodas * PRICE_SODAS);

        System.out.printf("PST: $%.2f\n", total * PST);
        System.out.printf("GST: $%.2f\n", total * GST);
        total = total + (total * GST) + (total * PST);
        System.out.printf("Total cost: %.2f\n", total);

        System.out.print("Cash recieved: $");
        cash = sc.nextDouble();
        if (cash >= total) {
            System.out.printf("Change due: $%.2f", cash - total);
        } else {
            System.out.println("NOT ENOUGH CASH");
        }

    }
}
