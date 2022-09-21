import java.util.*;

public class Marks {
    public static void main(String[] args) {
        int students, tests, highest_index = -1;
        double avg, class_avg, highest = 0;
        double[] avgs;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        students = sc.nextInt();
        avgs = new double[students];
        System.out.print("Enter number of tests: ");
        tests = sc.nextInt();
        System.out.println();

        for (int student = 0; student < students; student++) {
            avg = 0;
            for (int test = 0; test < tests; test++) {
                System.out.printf("Enter test %d's grade (%%) for student %d: ", test, student);
                avg += sc.nextDouble();
            }
            avg /= tests;
            System.out.printf("Student %d's average is %.1f%%\n\n", student, avg);
            avgs[student] = avg;
        }

        for (int i = 0; i < avgs.length; i++) {
            if (avgs[i] > highest) {
                highest = avgs[i];
                highest_index = i;
            }
        }
        System.out.printf("Student %d has the highest average: %.1f%%\n", highest_index, highest);
        class_avg = Arrays.stream(avgs).sum() / avgs.length;
        System.out.print("\nStudents with above average averages:");
        for (int i = 0; i < avgs.length; i++) {
            if (avgs[i] > class_avg) {
                System.out.printf("%d, ", i);
            }
        }
        System.out.println();
    }
}
