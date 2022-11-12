public class Computer {
    private String manufacturer, serial;
    private int year_made, year_purchased, ram, warranty_expiration;
    private static final int YEAR = 2022;
    private double speed;

    public Computer(String manufacturer, String serial, double speed, int ram, int year_made, int year_purchased,
            int warranty_expiration) {
        this.manufacturer = manufacturer;
        this.serial = serial;
        this.speed = speed;
        this.ram = ram;
        this.year_made = year_made;
        this.year_purchased = year_purchased;
        this.warranty_expiration = warranty_expiration;
    }

    public String toString() {
        return String.format(
                "Manufacturer: %s\nSerial: %s\nProcessor Speed: %.1f\nRAM: %d\nYear Made: %d\nYear Purchased: %d\nWarranty Expiration: %d\n",
                manufacturer, serial, speed, ram, year_made, year_purchased, warranty_expiration);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerial() {
        return serial;
    }

    public int getYearMade() {
        return year_made;
    }

    public int getAge() {
        return YEAR - year_made;
    }

    public int getExpiry() {
        return warranty_expiration;
    }

    public int getRAM() {
        return ram;
    }

    public Computer compareSpeed(Computer other) {
        if (other.speed > this.speed) {
            return other;
        }
        return this;
    }

    public Computer compareAge(Computer other) {
        if (other.year_made > this.year_made) {
            return other;
        }
        return this;
    }

    public Computer compareRAM(Computer other) {
        if (other.ram > this.ram) {
            return other;
        }
        return this;
    }
}
