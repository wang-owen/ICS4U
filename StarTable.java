import java.util.Scanner;
import java.io.*;

public class StarTable {
    public static void main(String[] args) {
        int x, y;
        String filename = "star.txt";
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw;
        BufferedReader br;

        System.out.print("Enter x dimensions for table: ");
        x = sc.nextInt();
        System.out.print("Enter y dimensions for table: ");
        y = sc.nextInt();

        try {
            bw = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.close();

            br = new BufferedReader(new FileReader(filename));
            for (int i = 0; i < y; i++) {
                System.out.println(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
