import java.io.*;

public class PrintAllChar {
    public static void main(String[] args) {
        String filename = "allChar.txt", line;
        char arr[];
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            line = br.readLine();
            do {
                arr = line.toCharArray();
                for (char c : arr) {
                    if (c != ' ') {
                        System.out.println(c);
                    }
                }
                line = br.readLine();
            } while (line != null);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
