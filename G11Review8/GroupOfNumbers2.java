import java.io.*;
import java.util.Scanner;

public class GroupOfNumbers2 {
    public static void main(String[] args) {
        int sum = 0;
        String filename = "input.txt", group = "", n = "";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            group = br.readLine();
            while (group != null) {
                try {
                    n = br.readLine();
                    sum += Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    System.out.println(group);
                    System.out.printf("Sum: %d\n\n", sum);
                    group = n;
                    sum = 0;
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
