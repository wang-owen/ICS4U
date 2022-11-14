public class Closet {
    private int maxCapacity;
    private int numShirts;
    private Shirt[] shirts;

    public Closet(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        shirts = new Shirt[maxCapacity];
        numShirts = 0;
    }

    public boolean addShirt(String color, int size, int year) {
        if (numShirts != maxCapacity) {
            shirts[numShirts] = new Shirt(color, size, year);
            numShirts++;
            return true;
        }
        return false;
    }

    public boolean removeOldest() {
        if (numShirts == 0) {
            return false;
        }

        boolean swap = true;
        int end = numShirts - 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < end; i++) {
                if (shirts[i].compareAge(shirts[i + 1]) == shirts[i + 1]) {
                    Shirt temp = shirts[i];
                    shirts[i] = shirts[i + 1];
                    shirts[i + 1] = temp;
                    swap = true;
                }
            }
            end--;
        }

        shirts[shirts.length - 1] = null;
        numShirts--;
        return true;
    }

    public int getNumSize(int size) {
        int n = 0;
        for (int i = 0; i < numShirts; i++) {
            if (shirts[i].getSize() == size) {
                n++;
            }
        }
        return n;
    }

    public Shirt getNewestShirt() {
        Shirt newest = shirts[0];
        for (int i = 1; i < shirts.length; i++) {
            newest = shirts[i].compareAge(shirts[i - 1]);
        }
        return newest;
    }

    public Shirt getBiggest() {
        boolean swap = true;
        int end = numShirts - 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < end; i++) {
                if (shirts[i].compareSize(shirts[i + 1]) == shirts[i + 1]) {
                    Shirt temp = shirts[i];
                    shirts[i] = shirts[i + 1];
                    shirts[i + 1] = temp;
                    swap = true;
                }
            }
            end--;
        }
        return shirts[0];
    }
}
