public class HouseSpec extends SecondarySpec {
    private boolean vacuum;
    private boolean ac;
    private boolean fireplace;
    private boolean hardwood;
    private boolean basement;

    public HouseSpec(boolean vacuum, boolean ac, boolean fireplace, boolean hardwood, boolean basement) {
        this.vacuum = vacuum;
        this.ac = ac;
        this.fireplace = fireplace;
        this.hardwood = hardwood;
        this.basement = basement;
    }

    public boolean matchSpec(SecondarySpec other, double percent) {
        HouseSpec h = (HouseSpec)other;
        int total = 0;
        if (h.vacuum == vacuum) {
            total++;
        }
        if (h.ac == ac) {
            total++;
        }
        if (h.fireplace == fireplace) {
            total++;
        }
        if (h.hardwood == hardwood) {
            total++;
        }
        if (h.basement == basement) {
            total++;
        }
        return (total / 5.00 >= percent);
    }

    public String toString() {
        String s = "vacuum: ";
        if (vacuum) {
            s += "Y\nAC: ";
        } else {
            s += "N\nAC: ";
        }
        if (ac) {
            s += "Y\nFireplace: ";
        } else {
            s += "N\nFireplace: ";
        }
        if (fireplace) {
            s += "Y\nHardwood: ";
        } else {
            s += "N\nHardwood: ";
        }
        if (hardwood) {
            s += "Y\nBasement: ";
        } else {
            s += "N\nBasement: ";
        }
        if (basement) {
            s += "Y";
        } else {
            s += "N";
        }
        return s;
    }
}
