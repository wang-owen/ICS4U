import java.util.Scanner;

public class BagTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int schoolbag, binder, n, sheets, sheets2;
        String choice, style, label, label2, color, color2;
        boolean valid = true;

        System.out.println("SchoolBag 0:");
        System.out.print("Enter style: ");
        style = sc.nextLine();
        System.out.print("Enter binder label 1: ");
        label = sc.nextLine();
        System.out.print("Enter binder color: ");
        color = sc.nextLine();
        System.out.print("Enter # of sheets: ");
        sheets = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter binder label 2: ");
        label2 = sc.nextLine();
        System.out.print("Enter binder color: ");
        color2 = sc.nextLine();
        System.out.print("Enter # of sheets: ");
        sheets2 = sc.nextInt();
        sc.nextLine();
        SchoolBag bag1 = new SchoolBag(style, sheets, sheets2, label, label2, color, color2);

        System.out.println("\nSchoolBag 1:");
        System.out.print("Enter style: ");
        style = sc.nextLine();
        System.out.print("Enter binder label 1: ");
        label = sc.nextLine();
        System.out.print("Enter binder color: ");
        color = sc.nextLine();
        System.out.print("Enter # of sheets: ");
        sheets = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter binder label 2: ");
        label2 = sc.nextLine();
        System.out.print("Enter binder color: ");
        color2 = sc.nextLine();
        System.out.print("Enter # of sheets: ");
        sheets2 = sc.nextInt();
        sc.nextLine();
        Binder b1 = new Binder(sheets, label, color);
        Binder b2 = new Binder(sheets2, label2, color2);
        SchoolBag bag2 = new SchoolBag(style, b1, b2);

        SchoolBag[] bags = {bag1, bag2};

        while (valid) {
            valid = false;
            System.out.print("Please select a schoolbag (by ID, 0 or 1): ");
            schoolbag = sc.nextInt();
            if (schoolbag == 0 || schoolbag == 1) {
                System.out.printf("Please select a binder in schoolbag %d (by ID, 0 or 1): ", schoolbag);
                binder = sc.nextInt();
                sc.nextLine();
                if (binder == 0 || binder == 1) {
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
