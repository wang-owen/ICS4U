public class Lab {
    private int max_capacity, num_installed;
    private Computer[] computers;
    private static final int YEAR = 2022;

    public Lab(int max_capacity) {
        this.max_capacity = max_capacity;
        computers = new Computer[max_capacity];
        num_installed = 0;
    }

    public void installComputer(String manufacturer, String serial, double speed, int ram, int year_made,
            int year_purchased,
            int warranty_expiration) {
        if (num_installed >= max_capacity) {
            System.out.println("Cannot install more computers.");
        } else {
            Computer computer = new Computer(manufacturer, serial, speed, ram, year_made, year_purchased,
                    warranty_expiration);
            computers[num_installed] = computer;
            num_installed++;
        }
    }

    public int avgAge() {
        int age = 0;
        for (int i = 0; i < num_installed; i++) {
            age += computers[i].getAge();
        }
        return age / num_installed;
    }

    public Computer newestComputer() {
        Computer latestComputer = computers[0];
        for (int i = 1; i < num_installed; i++) {
            latestComputer = latestComputer.compareAge(computers[i]);
        }
        return latestComputer;
    }

    public Computer fastestComputer() {
        Computer fastestComputer = computers[0];
        for (int i = 1; i < num_installed; i++) {
            fastestComputer = computers[i].compareSpeed(computers[i - 1]);
        }
        return fastestComputer;
    }

    public Computer highestRAM() {
        Computer fastestRAM = computers[0];
        for (int i = 1; i < num_installed; i++) {
            fastestRAM = fastestRAM.compareRAM(computers[i]);
        }
        return fastestRAM;
    }

    public int numManufacturer(String manufacturer) {
        int n = 0;
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].getManufacturer().equals(manufacturer)) {
                n++;
            }
        }
        return n;
    }

    public Computer[] getExpiring() {
        int n = 0;
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].getExpiry() == YEAR + 1) {
                n++;
            }
        }
        Computer[] arr = new Computer[n];
        for (int i = 0; i < num_installed; i++) {
            if (computers[i].getExpiry() == YEAR + 1) {
                arr[i] = computers[i];
            }
        }
        return arr;
    }
}
