public class SchoolBag {
    Binder b1, b2;

    public SchoolBag(Binder b1, Binder b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public SchoolBag(int sheets1, int sheets2, String label1, String label2, String color1, String color2) {
        this.b1 = new Binder();
        this.b2 = new Binder();
        b1.addSheets(sheets1);
        b2.addSheets(sheets2);
        b1.setLabel(label1);
        b2.setLabel(label2);
        b1.setColor(color1);
        b2.setColor(color2);
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

    public String toString() {
        return String.format("%s\n%s", this.b1, this.b2);
    }
}
