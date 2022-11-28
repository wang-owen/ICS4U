package OOP.Classes.Payroll;

public class PartTimeStaff {
    private final double HOURS = 24;
    private double numHoursAssigned;
    private double hourlyRate;
    private double sickDaysTaken;

    public PartTimeStaff(double numHoursAssigned, double hourlyRate) {
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        sickDaysTaken = 0;
    }

    public double pay() {
        return hourlyRate * (numHoursAssigned - sickDaysTaken * HOURS);
    }

    public boolean deductSickDay(double sickDaysTaken) {
        this.sickDaysTaken += sickDaysTaken;
        return true;
    }

    public void resetSickDay() {
        sickDaysTaken = 0;
    }

    public void printPayStub() {
        System.out.println("$" + pay());
    }

    public PartTimeStaff compareToSickDay(PartTimeStaff other) {
        // returns whomever took more sick days
        if (sickDaysTaken > other.sickDaysTaken) {
            return this;
        }
        return other;
    }

    public String toString() {
        return String.format(super.toString() + "Part time");
    }
}
