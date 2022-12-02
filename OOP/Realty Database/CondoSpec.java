public class CondoSpec extends SecondarySpec {
    private boolean pool;
    private boolean exRoom;
    private boolean locker;
    private boolean hydroIncluded;
    private boolean cableIncluded;

    public CondoSpec(boolean pool, boolean exRoom, boolean locker, boolean hydroIncluded, boolean cableIncluded) {
        this.pool = pool;
        this.exRoom = exRoom;
        this.locker = locker;
        this.hydroIncluded = hydroIncluded;
        this.cableIncluded = cableIncluded;
    }

    public boolean matchSpec(SecondarySpec other, double percent) {
        CondoSpec c = (CondoSpec) other;
        int total = 0;
        if (c.pool == pool) {
            total++;
        }
        if (c.exRoom == exRoom) {
            total++;
        }
        if (c.locker == locker) {
            total++;
        }
        if (c.hydroIncluded == hydroIncluded) {
            total++;
        }
        if (c.cableIncluded == cableIncluded) {
            total++;
        }
        return (total / 5.00 >= percent);
    }

    public String toString() {
        String s = "Pool: ";
        if (pool) {
            s += "Y\nGym: ";
        } else {
            s += "N\nGym: ";
        }
        if (exRoom) {
            s += "Y\nLocker: ";
        } else {
            s += "N\nLocker: ";
        }
        if (locker) {
            s += "Y\nHydro: ";
        } else {
            s += "N\nHydro: ";
        }
        if (hydroIncluded) {
            s += "Y\nCable: ";
        } else {
            s += "N\nCable: ";
        }
        if (cableIncluded) {
            s += "Y";
        } else {
            s += "N";
        }
        return s;
    }
}