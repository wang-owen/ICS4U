import java.util.*;

public class Line {
    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double slope(int x1, int y1, int x2, int y2) {
        return (Math.abs(y2 - y1)) / (Math.abs(x2 - x1));
    }

    public static void main(String[] args) {
        // variable declaration
        int x1, y1, x2, y2;
        double length1, length2, slope1, slope2;
        Scanner sc = new Scanner(System.in);

        // prompt for coordinates
        System.out.println("Please enter the two coordinates of line 1:");
        System.out.print("Vertex 1 x-value: ");
        x1 = sc.nextInt();
        System.out.print("Vertex 1 y-value: ");
        y1 = sc.nextInt();
        System.out.println();
        System.out.print("Vertex 2 x-value: ");
        x2 = sc.nextInt();
        System.out.print("Vertex 2 y-value: ");
        y2 = sc.nextInt();

        // determine length and slope of line 1
        length1 = Line.length(x1, y1, x2, y2);
        slope1 = Line.slope(x1, y1, x2, y2);

        // prompt for coordinates
        System.out.println("\nPlease enter the two coordinates of line 2:");
        System.out.print("Vertex 1 x-value: ");
        x1 = sc.nextInt();
        System.out.print("Vertex 1 y-value: ");
        y1 = sc.nextInt();
        System.out.println();
        System.out.print("Vertex 2 x-value: ");
        x2 = sc.nextInt();
        System.out.print("Vertex 2 y-value: ");
        y2 = sc.nextInt();

        length2 = Line.length(x1, y1, x2, y2);
        slope2 = Line.slope(x1, y1, x2, y2);

        // determine results
        System.out.println("\nResults:");
        if (length1 == length2) {
            System.out.println("The two lines have the same length.");
        } else {
            System.out.println("The two lines do not have the same length.");
        }
        if (slope1 == slope2) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.println("The two lines are not parallel.");
        }
    }
}
