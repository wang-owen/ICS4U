import java.util.Scanner;
import java.io.*;

public class LabTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum capacity: ");
        Lab lab = new Lab(sc.nextInt());
        sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader("computer.txt"));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String serial = br.readLine();
                String manufacturer = br.readLine();
                int year_made = Integer.parseInt(br.readLine());
                int year_purchased = Integer.parseInt(br.readLine());
                double speed = Double.parseDouble(br.readLine());
                int ram = Integer.parseInt(br.readLine());
                int warranty_expiration = Integer.parseInt(br.readLine());
                lab.installComputer(manufacturer, serial, speed, ram, year_made, year_purchased, warranty_expiration);
            }
            br.close();

            System.out.println(lab.avgAge());
            System.out.println(lab.newestComputer());
            System.out.println(lab.fastestComputer());
            System.out.println(lab.fastestComputer() == lab.highestRAM());
            System.out.print("Enter manufacturer: ");
            System.out.println(lab.numManufacturer(sc.nextLine()));
            sc.close();

            Computer[] expiring = lab.getExpiring();
            for (int i = 0; expiring[i] != null && i < expiring.length; i++) {
                System.out.println(expiring[i].getSerial());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
