import java.io.*;

public class Marks {
    public static void main(String[] args) {
        final int STUDENTS = 10, TESTS = 5;
        String filename = "marks.txt", result = "result.txt", line = "", msg;
        String[] marks;
        int[][] test_scores = new int[STUDENTS][TESTS];
        int avg = 0, highest = 0;
        BufferedReader br;
        BufferedWriter bw;

        try {
            br = new BufferedReader(new FileReader(filename));
            for (int student = 0; student < STUDENTS; student++) {
                line = br.readLine();
                if (line != null) {
                    marks = line.split(" ");
                    for (int mark = 0; mark < marks.length; mark++) {
                        test_scores[student][mark] = Integer.parseInt(marks[mark]);
                        avg += Integer.parseInt(marks[mark]);
                        avg /= TESTS;
                        if (avg > highest) {
                            highest = student;
                        }
                    }
                }
                avg = 0;
            }
            br.close();

            bw = new BufferedWriter(new FileWriter(result));
            bw.write("Student with highest avg: ");
            bw.write(highest + "\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        avg = 0;
        try {
            bw = new BufferedWriter(new FileWriter(result));
            bw.write("Class averages:\n");
            for (int test = 0; test < TESTS; test++) {
                msg = String.format("Test %d: ", test);
                bw.write(msg);
                for (int student = 0; student < STUDENTS; student++) {
                    avg += test_scores[student][test];
                }
                bw.write(avg / STUDENTS + "%\n");
                avg = 0;
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
