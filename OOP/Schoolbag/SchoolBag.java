public class SchoolBag {
    private Binder b1, b2;
    private String style;
    private static final double WEIGHT = 3;

    public SchoolBag(Binder b1, Binder b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public SchoolBag(String style, Binder b1, Binder b2) {
        this.style = style;
        this.b1 = b1;
        this.b2 = b2;
    }

    public SchoolBag(String style, int sheets1, int sheets2, String label1, String label2, String color1, String color2) {
        this.style = style;
        this.b1 = new Binder(sheets1, label1, color1);
        this.b2 = new Binder(sheets2, label2, color2);
    }

    public double weight(Binder b) {
        return b.getBinderWeight();
    }

    public void addSheets(int b, int x) {
        if (b == 0) {
            b1.addSheets(x);
        }
        else if (b == 1) {
            b2.addSheets(x);
        }
    }

    public void removeSheets(int b, int x) {
        if (b == 0) {
            b1.removeSheets(x);
        }
        else if (b == 1) {
            b2.removeSheets(x);
        }
    }

    public double getAvgWeight() {
        return (this.b1.getWeight() + this.b2.getWeight()) / 2;
    }

    public double getWeight() {
        return this.b1.getWeight() + this.b2.getWeight() + WEIGHT;
    }

    public String toString() {
        return String.format("Style: %s\nBinder #0 -\n%s\nBinder #1 -\n%s", style, b1, b2);
    }
}
