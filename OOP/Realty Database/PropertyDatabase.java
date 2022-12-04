import java.io.*;

public class PropertyDatabase {
    private int numProperty;
    private Property[] list;
    private static String filename = "data.txt";

    public PropertyDatabase() {
        numProperty = 0;
    }

    public boolean loadProperty() {
        boolean vacuum, ac, fireplace, hardwood, basement;
        boolean pool, exRoom, locker, hydroIncluded, cableIncluded;
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
                if (type.equals("house")) {
                    if (br.readLine().equals("Y")) {
                        vacuum = true;
                    } else {
                        vacuum = false;
                    }
                    if (br.readLine().equals("Y")) {
                        ac = true;
                    } else {
                        ac = false;
                    }
                    if (br.readLine().equals("Y")) {
                        fireplace = true;
                    } else {
                        fireplace = false;
                    }
                    if (br.readLine().equals("Y")) {
                        hardwood = true;
                    } else {
                        hardwood = false;
                    }
                    if (br.readLine().equals("Y")) {
                        basement = true;
                    } else {
                        basement = false;
                    }
                    list[numProperty] = (Property) (new House(id, address,
                            new PrimarySpec(zoneCode, price, size, numBedRoom),
                            new HouseSpec(vacuum, ac, fireplace, hardwood, basement)));
                    numProperty++;
                } else {
                    if (br.readLine().equals("Y")) {
                        pool = true;
                    } else {
                        pool = false;
                    }
                    if (br.readLine().equals("Y")) {
                        exRoom = true;
                    } else {
                        exRoom = false;
                    }
                    if (br.readLine().equals("Y")) {
                        locker = true;
                    } else {
                        locker = false;
                    }
                    if (br.readLine().equals("Y")) {
                        hydroIncluded = true;
                    } else {
                        hydroIncluded = false;
                    }
                    if (br.readLine().equals("Y")) {
                        cableIncluded = true;
                    } else {
                        cableIncluded = false;
                    }
                    list[numProperty] = (Property) (new Condo(id, address,
                            new PrimarySpec(zoneCode, price, size, numBedRoom),
                            new CondoSpec(pool, exRoom, locker, hydroIncluded, cableIncluded)));
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
