public class Shirt {
    private String colour;
    private int size;
    private int yearPurchased;
    private static final int YEAR = 2022;

    public Shirt(String colour, int size, int yearPurchased) {
        this.colour = colour;
        this.size = size;
        this.yearPurchased = yearPurchased;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public int getAge() {
        return YEAR - yearPurchased;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String toString() {
        return String.format("Colour: %s\nSize: %d\nYear purchased %d", colour, size, yearPurchased);
    }

    public Shirt compareSize(Shirt other) {
        if (other.size > this.size) {
            return other;
        }
        return this;
    }

    public Shirt compareAge(Shirt other) {
        if (other.getAge() < this.getAge()) {
            return other;
        }
        return this;
    }

    public boolean equals(Shirt other) {
        if (this.colour.equals(other.colour) && this.size == other.size) {
            return true;
        }
        return false;
    }
}