public class Circle {
    private int x, y, r;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = Math.abs(r);
    }

    public Circle(Circle c) {
        this.x = c.xCoord();
        this.y = c.yCoord();
        this.r = c.radius();
    }

    public int xCoord() {
        return this.x;
    }

    public int yCoord() {
        return this.y;
    }

    public int radius() {
        return this.r;
    }

    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    public Circle smaller(Circle c) {
        if (c.area() < this.area()) {
            return c;
        }
        return this;
    }

    public double distance(Circle c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

    public boolean isInside(Circle c) {
        int distSq = (int) Math.sqrt(((this.xCoord() - c.xCoord())
                * (this.xCoord() - c.xCoord()))
                + ((this.yCoord() - c.yCoord())
                        * (this.yCoord() - c.yCoord())));

        if (distSq + c.radius() <= this.radius()) {
            return true;
        }
        return false;
    }

    public boolean equal(Circle c) {
        if (this.radius() == c.radius()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "centre: (" + this.xCoord() + ", " + this.yCoord() + ") radius: " + this.radius();
    }
}
