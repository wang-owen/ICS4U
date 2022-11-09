public class Jam {
    private String fruit;
    private String date;
    private int size;

    public Jam() {
        this.fruit = "Strawberry";
        this.date = "01/01/00";
        this.size = 12;
    }

    public Jam(String fruit, String date, int size) {
        this.fruit = fruit;
        this.date = date;
        this.size = size;
    }

    public String getFruit() {
        return this.fruit;
    }

    public String toString() {
        return String.format("%s   %s   %d fl. oz", this.fruit, this.date, this.size);
    }

    public String spread(int oz) {
        if (this.size == 0) {
            return "No jam in the Jar!";
        }
        if (oz > this.size) {
            int amount = this.size;
            this.size = 0;
            return String.format("Spreading %d fluid ounces of %s", amount, this.fruit);
        }
        this.size -= oz;
        return String.format("Spreading %d fluid ounces of %s", oz, fruit);
    }
}