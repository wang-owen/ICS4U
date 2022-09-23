import java.io.*;

public class GroupOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        String filename = "input.txt", group = "", n = "";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            group = br.readLine();
            while ((n = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    System.out.println(group);
                    System.out.printf("Sum: %d\n\n", sum);
                    group = n;
                    sum = 0;
                }
            }
            System.out.println(group);
            System.out.printf("Sum: %d\n\n", sum);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
