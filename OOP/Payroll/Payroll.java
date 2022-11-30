package OOP.Classes.Payroll;

import java.io.*;

public class Payroll {
    private Employee[] staffList;
    private String filename = "employees.txt";

    public Payroll() {
        loadStaffList();
    }

    public Payroll(Employee[] staffList) {
        this.staffList = staffList;
    }

    public void listAllEmployee() {
        for (Employee e : staffList) {
            System.out.println(e + "\n");
        }
    }

    public boolean enterSickDay(int days, int employeeNumber) {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].employeeNumber == employeeNumber) {
                staffList[i].deductSickDay(days);
                return true;
            }
        }
        return false;
    }

    public void printAllPayStubs() {
        for (Employee e : staffList) {
            e.printPayStub();
        }
    }

    public void saveStaffList() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, false));
            bw.write(staffList.length + "\n");
            for (int i = 0; i < staffList.length; i++) {
                if (staffList[i] instanceof FullTimeStaff) {
                    bw.write("Full-time\n");
                    bw.write(staffList[i].firstName + "\n");
                    bw.write(staffList[i].lastName + "\n");
                    bw.write(((FullTimeStaff) staffList[i]).getYearlySalary() + "\n");
                } else {
                    bw.write("Part-time\n");
                    bw.write(staffList[i].firstName + "\n");
                    bw.write(staffList[i].lastName + "\n");
                    bw.write(((PartTimeStaff) staffList[i]).getNumHoursAssigned() + "\n");
                    bw.write(((PartTimeStaff) staffList[i]).getHourlyRate() + "\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public boolean loadStaffList() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int n = Integer.parseInt(br.readLine());
            staffList = new Employee[n];
            for (int i = 0; i < n; i++) {
                String type = br.readLine();
                int employeeNumber = Integer.parseInt(br.readLine());
                String firstName = br.readLine();
                String lastName = br.readLine();
                if (type.equals("Full-time")) {
                    double yearlySalary = Double.parseDouble(br.readLine());
                    staffList[i] = new FullTimeStaff(employeeNumber, firstName, lastName, yearlySalary);
                } else {
                    double numHoursAssigned = Double.parseDouble(br.readLine());
                    double hourlyRate = Double.parseDouble(br.readLine());
                    staffList[i] = new PartTimeStaff(employeeNumber, firstName, lastName, numHoursAssigned, hourlyRate);
                }
            }
            br.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public double averageSalary() {
        double total = 0;
        double n = 0;
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                total += ((FullTimeStaff) staffList[i]).getYearlySalary();
                n++;
            }
        }
        return total / n;
    }

    public double averageHourlyRate() {
        double total = 0;
        double n = 0;
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                total += ((PartTimeStaff) staffList[i]).getHourlyRate();
                n++;
            }
        }
        return total / n;
    }

    public FullTimeStaff mostAbsentFullTime() {
        FullTimeStaff mostAbsent = null;
        for (int i = 1; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                if (mostAbsent == null) {
                    mostAbsent = (FullTimeStaff) staffList[i];
                }
                mostAbsent = mostAbsent.compareToSickDay((FullTimeStaff) staffList[i]);
            }
        }
        return mostAbsent;
    }

    public PartTimeStaff mostAbsentPartTime() {
        PartTimeStaff mostAbsent = null;
        for (int i = 1; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                if (mostAbsent == null) {
                    mostAbsent = (PartTimeStaff) staffList[i];
                }
                mostAbsent = mostAbsent.compareToSickDay((PartTimeStaff) staffList[i]);
            }
        }
        return mostAbsent;
    }

    public void yearlySickDayReset() {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                ((FullTimeStaff) staffList[i]).resetSickDay();
            }
        }
    }

    public void monthlySickDayReset() {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                ((PartTimeStaff) staffList[i]).resetSickDay();
            }
        }
    }
}
