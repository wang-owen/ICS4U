import java.util.Scanner;
import java.io.*;

public class ClosetRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max closet capacity: ");
        int maxCapacity = sc.nextInt();
        sc.nextLine();
        Closet closet = new Closet(maxCapacity);

        try {
            BufferedReader br = new BufferedReader(new FileReader("boyShirts.txt"));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                closet.addShirt(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 2; i++) {
            System.out.printf("\nShirt %d:\n", i);
            System.out.print("Enter shirt color: ");
            String color = sc.nextLine();
            System.out.print("Enter shirt size: ");
            int size = sc.nextInt();
            System.out.print("Enter year purchased: ");
            int year = sc.nextInt();
            sc.nextLine();
            if (!closet.addShirt(color, size, year)) {
                closet.removeOldest();
                closet.addShirt(color, size, year);
            }
        }

        System.out.print("\nEnter size: ");
        System.out.printf("There are %d shirts in that size.\n\n", closet.getNumSize(sc.nextInt()));

        System.out.println(closet.getBiggest());
        sc.close();
    }
}
