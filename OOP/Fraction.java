class Fraction {
    private int num, den;

    public Fraction() {
        this.num = 1;
        this.den = 1;
    }

    public Fraction(int num, int den) {
        this.num = num;
        if (den != 0) {
            this.den = den;
        } else {
            this.den = 1;
        }
    }

    public Fraction(Fraction f) {
        this.num = f.getNumerator();
        this.den = f.getDenominator();
    }

    public Fraction(double d) {
        int counter = 0;
        while (d % 1 != 0) {
            d *= 10;
            counter *= 10;
        }
        this.num = (int) d;
        this.den = counter;

    }

    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public void setNumerator(int n) {
        num = n;
    }

    public void setDenominator(int n) {
        den = n;
    }

    public double size() {
        return Math.abs((double) num / den);
    }

    public Fraction larger(Fraction other) {
        if (this.size() >= other.size()) {
            return this;
        }
        return other;
    }

    public Fraction times(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    public Fraction plus(Fraction other) {
        Fraction f;
        if (this.den == other.den) {
            f = new Fraction(this.num + other.num, this.den);
        } else {
            f = new Fraction(this.num * other.den + other.num * this.den, this.den * other.den);
        }
        return f;
    }

    public void timesEquals(Fraction p) {
        this.num = this.num * p.den;
        this.den = this.den * p.den;
    }

    public void reduce() {
        int d = _gcd(this.num, this.den);

        this.num = this.num / d;
        this.den = this.den / d;
    }

    private int _gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return _gcd(y, x % y);
    }

    public boolean equals(Fraction x) {
        return x != null && this.size() == x.size();
    }

    public String toString() {
        return this.num + "/" + this.den;
    }

    public static Fraction product(Fraction f1, Fraction f2) {
        return f1.times(f2);
    }

    public static Fraction abs(Fraction f) {
        f.setNumerator(Math.abs(f.getNumerator()));
        f.setDenominator(Math.abs(f.getDenominator()));

        return f;
    }

    public static boolean isPositive(Fraction f) {
        if (f.size() > 0) { 
            return true;
        }
        return false;
    }
}