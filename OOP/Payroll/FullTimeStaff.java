package OOP.Classes.Payroll;

public class FullTimeStaff extends Employee {
    private static final double yearlySickDay = 20;
    private double yearlySalary;
    private double sickDaysLeft;

    public FullTimeStaff(int employeeNumber, String firstName, String lastName, double yearlySalary) {
        super(employeeNumber, firstName, lastName);
        this.yearlySalary = yearlySalary;
        sickDaysLeft = yearlySickDay;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public double pay() {
        return yearlySalary / 12;
    }

    public boolean deductSickDay(double sickDaysTaken) {
        if (sickDaysLeft - sickDaysTaken > 0) {
            sickDaysLeft -= sickDaysTaken;
            return true;
        }
        return false;
    }

    public void resetSickDay() {
        sickDaysLeft = yearlySickDay;
    }

    public void printPayStub() {
        System.out.println("$" + pay());
    }

    public FullTimeStaff compareToSickDay(FullTimeStaff other) {
        // returns whomever took more sick days
        if (sickDaysLeft < other.sickDaysLeft) {
            return this;
        }
        return other;
    }

    public String toString() {
        return String.format("Full-time\n" + super.toString());
    }
}
