import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String first, last;
        String[] split = line.split(" ");

        first = split[0].charAt(0) + "";
        last = split[0].charAt(split[0].length() - 1) + "";
        split[0] = last + split[0].substring(1, split[0].length() - 1) + first;
        
    }
}