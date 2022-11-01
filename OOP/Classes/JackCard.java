public class JackCard {
    private static double maxBalance;
    private String cardHolder;
    private double balance, discount;
    public int points, pin;

    public JackCard() {
        this.cardHolder = "default";
        this.balance = 0;
        this.discount = 0;
        this.points = 0;
        this.pin = 1234;
    }

    public JackCard(String name, double balance, int pin) {
        this.cardHolder = name;
        this.balance = balance;
        this.pin = pin;
        updateDiscount();
    }

    private void updateDiscount() {
        if (this.balance >= 500) {
            this.discount = 0.05;
        } else if (this.balance >= 200) {
            this.discount = 0.03;
        } else if (this.balance >= 100) {
            this.discount = 0.02;
        }
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public double getBalance() {
        return balance;
    }

    private double getPIN() {
        return pin;
    }

    public double getDiscount() {
        return discount;
    }

    public int getPoints() {
        return points;
    }

    public static void setMaxBalance(double max) {
        maxBalance = max;
    }

    private void setPoints(int points) {
        this.points = points;
    }

    private void setPIN(int pin) {
        this.pin = pin;
    }

    public boolean refill(double amount) {
        this.balance += amount;
        if (this.balance > maxBalance) {
            this.balance = maxBalance;
            updateDiscount();
            return false;
        }
        updateDiscount();
        return true;
    }

    public boolean pay(double amount, int pin, boolean usePoint) {
        if (pin == this.pin) {
            if (!usePoint) {
                this.setPoints(this.getPoints() + (int) (amount / 20));
                amount -= amount * discount;
                this.balance -= amount;
                return true;
            }
            if (usePoint && points / 20 >= amount) {
                amount -= amount * discount;
                this.balance -= amount;
                this.points -= amount * 20;
                return true;
            }
            return false;
        }
        return false;
    }

    public JackCard higherBalance(JackCard j) {
        if (j.getBalance() > this.getBalance()) {
            return j;
        }
        return this;
    }

    public JackCard morePoints(JackCard j) {
        if (j.getPoints() > this.getPoints()) {
            return j;
        }
        return this;
    }

    public void combinePoints(JackCard j) {
        this.setPoints(this.getPoints() + j.getPoints());
        j.setPoints(0);
    }

    public boolean changePIN(String name, int pin) {
        if (this.getCardHolder().equals(name)) {
            this.setPIN(pin);
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("Card Holder: %s\nBalance: $%.2f\nDiscount rate: %.0f%%\nPoints: %d\nPIN: %d\n",
                this.getCardHolder(), this.getBalance(), this.getDiscount() * 100, this.getPoints(), this.getPIN());
    }
}