package OOP.Payroll;

public abstract class Employee {
    int employeeNumber;
    String firstName;
    String lastName;

    public Employee(int employeeNumber, String firstName, String lastName) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract double pay();

    abstract boolean deductSickDay(double sickDaysTaken);

    abstract void resetSickDay();

    abstract void printPayStub();

    public String toString() {
        return String.format("%s %s\nEmployee Number: %d", firstName, lastName, employeeNumber);
    }
}
