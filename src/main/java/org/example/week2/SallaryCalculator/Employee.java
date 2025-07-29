package org.example.week2.SallaryCalculator;

public class Employee {
    private String name;// Employee's name and surname
    private double salary;// Employee's salary
    private int hireYear;// Hire year
    private int workHours;// Weekly work hours

    // Constructor method with 4 parameters
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Calculates the tax applied to the salary
    public double tax() {
        if (salary < 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }
    }

    // Calculates bonus fees for extra hours
    public double bonus() {
        if (workHours <= 40) {
            return 0.0;
        } else {
            return (workHours - 40) * 30;
        }
    }

    // Calculates salary raise based on years worked (using 2021 as current year)
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear; // Calculate years worked since hire year
        if (yearsWorked < 10) { // 0 to 9 years: 5% raise
            return salary * 0.05;
        } else if (yearsWorked < 20) { // 10 to 19 years: 10% raise
            return salary * 0.10;
        } else { // 20 years and above: 15% raise
            return salary * 0.15;
        }
    }

    // Prints employee information to the screen
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithTaxAndBonus = salary - taxAmount + bonusAmount;
        double totalSalary = salaryWithTaxAndBonus + raiseAmount;

        return "Name : " + name +
                "\nSalary : " + salary +
                "\nWork Hours : " + workHours +
                "\nYear of Establishment: " + hireYear +
                "\nTax : " + taxAmount +
                "\nBonus : " + bonusAmount +
                "\nSalary Increase: " + raiseAmount +
                "\nSalary including taxes and bonuses : " + salaryWithTaxAndBonus +
                "\nTotal Salary : " + totalSalary;
    }
}
