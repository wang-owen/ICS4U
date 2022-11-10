import java.util.Scanner;

public class BagTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int schoolbag, binder, n;
        String choice;
        boolean valid = true;

        SchoolBag bag1 = new SchoolBag(0, 10, "Math", "English", "Red", "Blue");
        SchoolBag bag2 = new SchoolBag(10, 0, "Science", "French", "Green", "Brown");
        SchoolBag[] bags = {bag1, bag2};

        while (valid) {
            valid = false;
            System.out.print("Please select a schoolbag (by ID, 0 or 1): ");
            schoolbag = sc.nextInt();
            if (schoolbag >= 0) {
                System.out.printf("Please select a binder in schoolbag %d (by ID, 0 or 1): ", schoolbag);
                binder = sc.nextInt();
                sc.nextLine();
                if (binder >= 0) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    choice = sc.nextLine();
                    System.out.print("# of sheets: ");
                    n = sc.nextInt();
                    System.out.println();
                    switch (choice.charAt(0)) {
                        case 'a':
                            bags[schoolbag].addSheets(binder, n);
                            valid = true;
                            break;
                        case 'r':
                            bags[schoolbag].removeSheets(binder, n);
                            valid = true;
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                }
            }
        }
        System.out.println("\nSchoolBag #0");
        System.out.println(bag1);
        System.out.println("\nSchoolBag #1");
        System.out.println(bag2);
        sc.close();
    }
}
