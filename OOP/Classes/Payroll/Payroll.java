package OOP.Classes.Payroll;

public class Payroll {
    private Employee[] staffList;

    public void listAllEmployee() {
        for (Employee e : staffList) {
            System.out.println(e);
        }
    }
}
