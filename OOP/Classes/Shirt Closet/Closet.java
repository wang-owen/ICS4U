public class Closet {
    private int maxCapacity;
    private int numShirts;
    Shirt[] closet;

    public Closet(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        numShirts = 0;
        closet = new Shirt[maxCapacity];
    }

    public boolean addShirt(String colour, int size, int yearPurchased) {
        if (numShirts != maxCapacity) {
            closet[numShirts] = new Shirt(colour, size, yearPurchased);
            numShirts++;
            return true;
        }
        return false;
    }

    public boolean removeOldest() {
        if (numShirts > 0) {
            int oldestIdx = 0;
            for (int i = 0; i < numShirts; i++) {
                if (closet[oldestIdx].compareAge(closet[i]) == closet[oldestIdx]) {
                    oldestIdx = i;
                }
            }
            Shirt temp = closet[numShirts];
            closet[numShirts] = closet[oldestIdx];
            closet[oldestIdx] = temp;
            return true;
        }
        return false;
    }

    public int sizeCount(int size) {
        int n = 0;
        for (int i = 0; i < numShirts; i++) {
            if (closet[i].getSize() == size) {
                n++;
            }
        }
        return n;
    }

    public Shirt getNewest() {
        if (numShirts > 0) {
            Shirt newest = closet[0];
            for (int i = 0; i < numShirts; i++) {
                newest = newest.compareAge(closet[i]);
            }
            return newest;
        }
        return null;
    }

    public Shirt getBiggest() {
        if (numShirts > 0) {
            Shirt biggest = closet[0];
            for (int i = 0; i < numShirts; i++) {
                biggest = biggest.compareSize(closet[i]);
            }
            return biggest;
        }
        return null;
    }

}
