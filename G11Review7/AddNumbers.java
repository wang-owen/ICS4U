import java.io.*;

public class AddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        String filename = "numbers.txt", line = "0";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            do {
                sum += Integer.parseInt(line);
                line = br.readLine();
            } while (line != null);
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(sum);
    }
}
