import java.util.Scanner;

public class AddPairs {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String n = sc.nextLine();

        for (int i = 0; i <= n.length() / 2; i += 2) {
            sum += Integer.parseInt(n.substring(i, i + 2));
        }

        if (n.length() % 2 == 1) {
            sum += Integer.parseInt(n.substring(n.length() - 2, n.length() - 1));
        }

        System.out.println(sum);
        sc.close();
    }
}
