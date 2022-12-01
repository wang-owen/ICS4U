package OOP.Payroll;

public class PartTimeStaff extends Employee {
    private final double HOURS = 24;
    private double numHoursAssigned;
    private double hourlyRate;
    private double sickDaysTaken;

    public PartTimeStaff(int employeeNumber, String firstName, String lastName, double numHoursAssigned,
            double hourlyRate) {
        super(employeeNumber, firstName, lastName);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        sickDaysTaken = 0;
    }

    public double getNumHoursAssigned() {
        return numHoursAssigned;
    }

    public double getHourlyRate() {
        return hourlyRate;
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
        return String.format("Part-time\n" + super.toString());
    }
}
