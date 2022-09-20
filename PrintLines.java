import java.io.*;

public class PrintLines {
    public static void main(String[] args) {
        String filename = "line.txt", line;
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            line = br.readLine();
            do {
                System.out.println(line);
                line = br.readLine();
            } while (line != null);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
