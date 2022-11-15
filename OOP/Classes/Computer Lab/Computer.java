/*
 * File: Computer.java
 * Description: Class representing an individual computer.
 */

public class Computer {
    private String manufacturer;
    private String serial;
    private int yearMade;
    private int yearPurchased;
    private int ram;
    private int warrantyExpire;
    private double speed;
    private static final int YEAR = 2022;

    /**
     * Computer constructor: initializes a computer object
     * 
     * @param manufacturer       Computer manufacturer
     * @param serial             Serial # of Computer
     * @param speed              Processor speed
     * @param ram                Ram
     * @param year_made          Year made
     * @param year_purchased     Year purchased
     * @param warrantyExpiration Warranty expiration year
     */
    public Computer(String manufacturer, String serial, double speed, int ram, int yearMade, int yearPurchased,
            int warrantyExpire) {
        this.manufacturer = manufacturer;
        this.serial = serial;
        this.speed = speed;
        this.ram = ram;
        this.yearMade = yearMade;
        this.yearPurchased = yearPurchased;
        this.warrantyExpire = warrantyExpire;
    }

    // Accessors
    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerial() {
        return serial;
    }

    public int getYearMade() {
        return yearMade;
    }

    public int getAge() {
        return YEAR - yearMade;
    }

    public int getExpiry() {
        return warrantyExpire;
    }

    public int getRAM() {
        return ram;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    // Mutators
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public void setExpiry(int warrantyExpire) {
        this.warrantyExpire = warrantyExpire;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    // toString: String representation of Computer info
    public String toString() {
        return String.format(
                "Manufacturer: %s\nSerial: %s\nProcessor Speed: %.1f\nRAM: %d\nYear Made: %d\nYear Purchased: %d\nWarranty Expiration: %d\n",
                manufacturer, serial, speed, ram, yearMade, yearPurchased, warrantyExpire);
    }

    /**
     * compareSpeed: compares speed of two Computer objects
     * 
     * @param other Computer to compare to
     * @return Computer with faster CPU
     */
    public Computer compareSpeed(Computer other) {
        if (other.speed > this.speed) {
            return other;
        }
        return this;
    }

    /**
     * compareAge: compares the age of two Computer objects
     * 
     * @param other Computer to compare to
     * @return older computer
     */
    public Computer compareAge(Computer other) {
        if (other.yearMade > this.yearMade) {
            return other;
        }
        return this;
    }

    /**
     * compareRAM: compares the RAM of two Computer objects
     * 
     * @param other Computer to compare to
     * @return Computer with larger RAM
     */
    public Computer compareRAM(Computer other) {
        if (other.ram > this.ram) {
            return other;
        }
        return this;
    }

    /**
     * isExpiring: determines if Computer is expiring next year
     * 
     * @return boolean stating whether it is or is not expiring next year
     */
    public boolean isExpiring() {
        return warrantyExpire == YEAR + 1;
    }
}
