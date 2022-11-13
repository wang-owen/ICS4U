import java.util.Scanner;

public class PantryTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jam j1 = new Jam("Gooseberry", "7/4/86", 12);
        Jam j2 = new Jam("Crab Apple", "9/30/99", 8);
        Jam j3 = new Jam("Rhubarb", "10/31/99", 16);
        Pantry p = new Pantry(j1, j2, j3);
        boolean valid = true;
        int choice = 0;
        Jam jam = j1;

        System.out.println("Welcome to Mother Hubbard's Pantry!");
        while (valid) {
            System.out.println(p);
            System.out.println("Enter your selection (1, 2, or 3):");
            choice = sc.nextInt();
            if (choice == 1) {
                jam = j1;
            } else if (choice == 2) {
                jam = j2;
            } else if (choice == 3) {
                jam = j3;
            } else {
                System.out.println("Good-by");
                valid = false;
            }

            if (valid) {
                System.out.println("Enter amount to spread:");
                int amount = sc.nextInt();
                System.out.println(p.spread(jam, amount));
            }
        }
        sc.close();
    }
}
