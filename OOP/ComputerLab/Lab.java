/* 
 * File: Lab.java
 * Description: Class representing a lab of Computers.
 */

public class Lab {
    private int maxCapacity;
    private int num_installed;
    private Computer[] computers;

    /**
     * Constructor
     * 
     * @param maxCapacity Maximum capacity of lab.
     */
    public Lab(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        computers = new Computer[maxCapacity];
        num_installed = 0;
    }

    /**
     * installComputer: Creates Computer object and adds to array;
     * 
     * @param manufacturer        Computer manufacturer
     * @param serial              Serial # of Computer
     * @param speed               Processor speed
     * @param ram                 Ram
     * @param year_made           Year made
     * @param year_purchased      Year purchased
     * @param warrantyExpiration Warranty expiration year
     * @return Whether computer was successfully installed.
     */
    public boolean installComputer(String manufacturer, String serial, double speed, int ram, int year_made,
            int year_purchased,
            int warrantyExpiration) {
        if (num_installed >= maxCapacity) {
            return false;
        }
        computers[num_installed] = new Computer(manufacturer, serial, speed, ram, year_made, year_purchased,
                warrantyExpiration);
        num_installed++;
        return true;
    }

    /**
     * avgAge: return average age of computers in lab
     * 
     * @return Average age
     */
    public int avgAge() {
        int age = 0;
        for (int i = 0; i < num_installed; i++) {
            age += computers[i].getAge();
        }
        return age / num_installed;
    }

    /**
     * newestComputer: return the latest dated computer in lab
     * 
     * @return computer object
     */
    public Computer newestComputer() {
        Computer latestComputer = computers[0];
        for (int i = 0; i < num_installed; i++) {
            latestComputer = latestComputer.compareAge(computers[i]);
        }
        return latestComputer;
    }

    /**
     * fastestComputer: return fastest cpu computer in lab
     * 
     * @return computer object
     */
    public Computer fastestComputer() {
        Computer fastestComputer = computers[0];
        for (int i = 0; i < num_installed; i++) {
            fastestComputer = fastestComputer.compareSpeed(computers[i]);
        }
        return fastestComputer;
    }

    /**
     * highestRAM: find and return highest ram computer
     * 
     * @return computer object
     */
    public Computer highestRAM() {
        Computer fastestRAM = computers[0];
        for (int i = 0; i < num_installed; i++) {
            fastestRAM = fastestRAM.compareRAM(computers[i]);
        }
        return fastestRAM;
    }

    /**
     * numManufactuerer: returns number of computers by a given manufacterer
     * 
     * @param manufacturer manufacturer of computer
     * @return number of computers with given manufacturer
     */
    public int numManufacturer(String manufacturer) {
        int n = 0;
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].getManufacturer().equals(manufacturer)) {
                n++;
            }
        }
        return n;
    }

    /**
     * getExpiring: return array of computers expiring next year
     * 
     * @return computer array
     */
    public Computer[] getExpiring() {
        int n = 0;
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].isExpiring()) {
                n++;
            }
        }
        Computer[] arr = new Computer[n];
        n = 0;
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].isExpiring()) {
                arr[n] = computers[i];
                n++;
            }
        }
        return arr;
    }
}
