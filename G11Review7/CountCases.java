import java.io.*;

public class CountCases {
    public static void main(String[] args) {
        int upper = 0, lower = 0;
        String filename = "passage.txt";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filename));
            for (char c : br.readLine().toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lower++;
                }
                else if (Character.isUpperCase(c)) {
                    upper++;
                }
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.printf("Upper case count: %d\n", upper);
        System.out.printf("Lower case counnt: %d\n", lower);
    }
}
