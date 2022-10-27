class Fraction {
    int num, den;

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
        Fraction f = new Fraction();
        f.num = this.num * other.num;
        f.den = this.den * other.den;
        return f;
    }

    public Fraction plus(Fraction other) {
        Fraction f = new Fraction();
        if (this.den == other.den) {
            f.num = this.num + other.num;
            f.den = this.den;
        } else {
            f.num = this.num * other.den + other.num + this.den;
            f.den = this.den * other.den;
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

    int _gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return _gcd(y, x % y);
    }
}