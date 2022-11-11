public class Binder {
    private int sheets;
    private String label, color;
    private static final double SHEET_WEIGHT = 0.01, BINDER_WEIGHT = 1;

    public Binder(int sheets, String label, String color) {
        this.sheets = sheets;
        this.label = label;
        this.color = color;
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
        return BINDER_WEIGHT;
    }

    public double getWeight() {
        return BINDER_WEIGHT + SHEET_WEIGHT * this.sheets;
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
        return String.format("Label: %s\nColor: %s\n# of sheets: %d", this.label, this.color, this.sheets);
    }
}