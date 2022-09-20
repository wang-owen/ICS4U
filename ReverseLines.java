import java.io.*;

public class ReverseLines {
    public static void main(String[] args) {
        String filename = "line.txt", line;
        char[] arr;
        char t;
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            line = br.readLine();
            for (int i = 0; i < Integer.parseInt(line); i++) {
                arr = br.readLine().toCharArray();
                for (int j = 0; j < arr.length / 2; j++) {
                    t = arr[j];
                    arr[j] = arr[arr.length - j - 1];
                    arr[arr.length - j - 1] = t;
                }
                for (char c : arr) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
