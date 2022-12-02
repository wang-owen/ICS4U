public class PropertyDatabase {
    private int numProperty;
    private Property[] list;

    public PropertyDatabase() {
        numProperty = 0;
    }

    public Property searchByID(String id) {
        for (int i = 0; i < numProperty; i++) {
            if (list[i].getID().equals(id)) {
                return list[i];
            }
        }
        return null;
    }

    public void printAllMatch(PrimarySpec p, SecondarySpec s, double percent) {
        for (int i = 0; i < numProperty; i++) {
            if (list[i].matchProperty(p, s, percent)) {
                System.out.println(list[i]);
            }
        }
    }

    public double averagePriceInZone(String zoneCode) {
        
    }
}
