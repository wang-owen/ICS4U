public class Shirt {
    private String color;
    private int size, year;
    private static final int YEAR = 2022;

    public Shirt(String color, int size, int year) {
        this.color = color;
        this.size = size;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getYearPurchased() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setYearPurchased(int year) {
        this.year = year;
    }

    public int getAge() {
        return YEAR - year;
    }

    public String toString() {
        return String.format("Color: %s\nSize: %d\nYear purchased: %d", color, size, year);
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
        if (this.color.equals(other.color) && this.size == other.size) {
            return true;
        }
        return false;
    }
}
