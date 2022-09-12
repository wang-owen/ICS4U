import java.util.*;

public class G11Review1_4 {
    public static void main(String[] args) {
        int birth_year, birth_month, birth_day;
        int current_year, current_month, current_day;
        int days_alive;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        birth_year = sc.nextInt();
        System.out.print("Month: ");
        birth_month = sc.nextInt();
        System.out.print("Day: ");
        birth_day = sc.nextInt();

        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        current_year = sc.nextInt();
        System.out.print("Month: ");
        current_month = sc.nextInt();
        System.out.print("Day: ");
        current_day = sc.nextInt();

        days_alive = 365 * (current_year - (++birth_year)); // years since birth
        days_alive += 30 * (current_month - 1) + current_day; // days since start of current year
        days_alive += (30 - birth_day) + (30 * (12 - birth_month)); // remaining days from birth year
        System.out.println("You have been alive for " + days_alive + " days.");
        System.out.println("You have slept " + days_alive * 8 + " hours.");
    }
}