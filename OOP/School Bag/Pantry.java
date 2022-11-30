public class Pantry {
    private Jam j1, j2, j3;

    public Pantry(Jam j1, Jam j2, Jam j3) {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
    }

    public String spread(Jam j, int oz) {
        return j.spread(oz);
    }

    public String toString() {
        return String.format("\nThe jams are:\n1: %s\n2: %s\n3: %s", j1, j2, j3);
    }
}