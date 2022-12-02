public class PrimarySpec {
    private String zoneCode;
    private double price;
    private int size;
    private int numBedRoom;

    public PrimarySpec(String zoneCode, double price, int size, int numBedRoom) {
        this.zoneCode = zoneCode;
        this.price = price;
        this.size = size;
        this.numBedRoom = numBedRoom;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public double getPrice() {
        return price;
    }

    public boolean matchSpec(PrimarySpec other) {
        if (this.zoneCode.equals(other.zoneCode) && this.price <= other.price && this.size >= other.size
                && this.numBedRoom >= other.numBedRoom) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("Zone code: %s\nPrice: $%.2f\nSize: %d sq ft\n# of bedrooms: %d");
    }
}
