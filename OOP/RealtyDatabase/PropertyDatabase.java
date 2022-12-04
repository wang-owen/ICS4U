import java.io.*;

public class PropertyDatabase {
    private int numProperty;
    private Property[] list;
    private static String filename = "data.txt";

    public PropertyDatabase() {
        numProperty = 0;
    }

    public boolean loadProperty() {
        boolean spec1, spec2, spec3, spec4, spec5;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int n = Integer.parseInt(br.readLine());
            list = new Property[n];
            for (int i = 0; i < n; i++) {
                br.readLine();
                String type = br.readLine();
                int id = Integer.parseInt(br.readLine());
                String address = br.readLine();
                String zoneCode = br.readLine();
                double price = Double.parseDouble(br.readLine());
                int size = Integer.parseInt(br.readLine());
                int numBedRoom = Integer.parseInt(br.readLine());
                String s1 = br.readLine();
                String s2 = br.readLine();
                String s3 = br.readLine();
                String s4 = br.readLine();
                String s5 = br.readLine();
                if (s1.equals("Y")) {
                    spec1 = true;
                } else {
                    spec1 = false;
                }
                if (s2.equals("Y")) {
                    spec2 = true;
                } else {
                    spec2 = false;
                }
                if (s3.equals("Y")) {
                    spec3 = true;
                } else {
                    spec3 = false;
                }
                if (s4.equals("Y")) {
                    spec4 = true;
                } else {
                    spec4 = false;
                }
                if (s5.equals("Y")) {
                    spec5 = true;
                } else {
                    spec5 = false;
                }
                if (type.equals("house")) {
                    list[numProperty] = (Property) (new House(id, address,
                            new PrimarySpec(zoneCode, price, size, numBedRoom),
                            new HouseSpec(spec1, spec2, spec3, spec4, spec5)));
                    numProperty++;
                } else {
                    list[numProperty] = (Property) (new Condo(id, address,
                            new PrimarySpec(zoneCode, price, size, numBedRoom),
                            new CondoSpec(spec1, spec2, spec3, spec4, spec5)));
                    numProperty++;
                }
            }
            br.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public Property searchByID(int id) {
        for (int i = 0; i < numProperty; i++) {
            if (list[i].getID() == id) {
                return list[i];
            }
        }
        return null;
    }

    public void printAllMatch(PrimarySpec p, SecondarySpec s, double percent) {
        if (s instanceof CondoSpec) {
            for (int i = 0; i < numProperty; i++) {
                if (list[i] instanceof Condo && list[i].matchProperty(p, s, percent)) {
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numProperty; i++) {
                if (list[i] instanceof House && list[i].matchProperty(p, s, percent)) {
                    System.out.println(list[i]);
                }
            }
        }
    }

    public double averagePriceInZone(String zoneCode) {
        int total = 0;
        double n = 0;
        for (int i = 0; i < numProperty; i++) {
            if (list[i].getZoneCode().equals(zoneCode)) {
                total += (list[i]).getPrice();
                n++;
            }
        }
        return total / n;
    }

    public Condo largestCondo() {
        Condo largest = null;
        for (int i = 0; i < numProperty; i++) {
            if (list[i] instanceof Condo) {
                if (largest == null) {
                    largest = (Condo) list[i];
                } else {
                    largest = (Condo) (largest.compareSize(list[i]));
                }
            }
        }
        return largest;
    }

    public void printCondo() {
        for (int i = 0; i < numProperty; i++) {
            if (list[i] instanceof Condo) {
                System.out.println(list[i]);
            }
        }
    }

    public void printHouse() {
        for (int i = 0; i < numProperty; i++) {
            if (list[i] instanceof House) {
                System.out.println(list[i]);
            }
        }
    }
}
