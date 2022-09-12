import java.util.*;

public class SortThreeLetters {
    public static void main(String[] args) {
        // variable declaration
        char big, mid, small, temp;
        Scanner sc = new Scanner(System.in);

        // prompts user for three ints
        System.out.println("Enter three lowercase letters:");
        System.out.print("Letter 1: ");
        big = sc.next().charAt(0);
        System.out.print("Letter 2: ");
        mid = sc.next().charAt(0);
        System.out.print("Letter 3: ");
        small = sc.next().charAt(0);

        // determines if all numbers are valid
        if (big >= 97 && big <= 122 && mid >= 97 && mid <= 122 && small >= 97 && small <= 122) {
            // ensures that the var small holds the smallest number
            if (small > big) {
                temp = big;
                big = small;
                small = temp;
            }
            if (small > mid) {
                temp = mid;
                mid = small;
                small = temp;
            }
            // ensures that the var mid holds the 2nd largest number;
            if (mid > big) {
                temp = big;
                big = mid;
                mid = temp;
            }
            // outputs numbers in ascending order
            System.out.printf("%c, %c, %c\n", small, mid, big);
        } else {
            // outputs error message
            System.out.println("ERROR: Must be lowercase.");
        }
    }
}
