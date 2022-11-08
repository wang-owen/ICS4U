public class Binder {
    private int sheets;
    private String label, color;
    private static final double sheet_weight = 0.01, binder_weight = 1;

    public Binder() {
        this.sheets = 0;
    }

    public void addSheets(int x) {
        this.sheets += x;
    }

    public void removeSheets(int x) {
        if (x > this.sheets) {
            this.sheets = 0;
        } else {
            this.sheets -= x;
        }
    }

    public double getBinderWeight() {
        return binder_weight;
    }

    public double getWeight() {
        return binder_weight + sheet_weight * this.sheets;
    }

    public int compareTo(Binder b) {
        if (this.getWeight() == b.getWeight()) {
            return 0;
        }
        if (this.getWeight() > b.getWeight()) {
            return 1;
        }
        return -1;
    }

    public String toString() {
        return String.format("Label: %s\nColor: %s\n# of sheets: %d\n", this.label, this.color, this.sheets);
    }
}