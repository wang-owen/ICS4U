import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double[] length = new double[2], slope = new double[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < length.length; i++) {
            System.out.printf("\nPlease enter the two coordinates of line %d:\n", i);
            System.out.print("Vertex 1 x-value: ");
            x1 = sc.nextInt();
            System.out.print("Vertex 1 y-value: ");
            y1 = sc.nextInt();

            System.out.print("\nVertex 2 x-value: ");
            x2 = sc.nextInt();
            System.out.print("Vertex 2 y-value: ");
            y2 = sc.nextInt();

            length[i] = Line.length(x1, y1, x2, y2);
            slope[i] = Line.slope(x1, y1, x2, y2);
        }

        System.out.println("\nResults:");
        if (length[0] == length[1]) {
            System.out.println("The two lines have the same length.");
        } else {
            System.out.println("The two lines do not have the same length.");
        }

        if (slope[0] == slope[1]) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.println("The two lines are not parallel");
        }
        sc.close();
    }
}
