import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        final int STUDENT = 5, DAY = 5;
        int[] student_numbers = new int[STUDENT];
        boolean[][] attendance = new boolean[STUDENT][DAY];
        boolean status;
        int most_absent = 0, absent = 0, absentee = 0, present = 0, perfect_days = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < STUDENT; i++) {
            student_numbers[i] = i;
        }


        for (int i = 0; i < attendance.length; i++) {
            System.out.printf("\nEnter attendance for student %d:\n", student_numbers[i]);
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.printf("Day %d (true/false): ", j);
                status = sc.nextBoolean();
                attendance[i][j] = status;
                if (!status) {
                    absent++;
                }
            }
            if (absent > most_absent) {
                most_absent = absent;
                absentee = student_numbers[i];
            }
            absent = 0;
        }

        System.out.printf("\nStudent with most absences: %d\n", absentee);

        for (int i = 0; i < DAY; i++) {
            for (int j = 0; j < STUDENT; j++) {
                if (attendance[j][i]) {
                    present++;
                }
            }
            if (present == STUDENT) {
                perfect_days++;
            }
            present = 0;
        }

        System.out.printf("There were %d days with perfect attendance.\n", perfect_days);
    }
}