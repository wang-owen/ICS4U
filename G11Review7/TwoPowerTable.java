import java.util.Scanner;
import java.io.*;

public class TwoPowerTable {
    public static void main(String[] args) {
        int max;
        String filename = "twoPowerTable.html", line;
        BufferedWriter bw;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max power: ");
        max = sc.nextInt();
        sc.close();

        try {
            bw = new BufferedWriter(new FileWriter(filename));
            bw.write("<html><head>\n");
            bw.write("<title>Powers of Two</title>\n");
            bw.write("</head>\n");
            bw.write("<body>");
            bw.write("<table border cellpadding=5>");

            bw.write("<tr><td>Exponent</td><td>Power of 2</td></tr>\n");
            for (int i = 0; i <= max; i++) {
                line = String.format("<tr><td>%d</td><td>%d</td></tr>\n", i, (int)Math.pow(2, i));
                bw.write(line);
            }
            bw.write("</table></body></html>");
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
