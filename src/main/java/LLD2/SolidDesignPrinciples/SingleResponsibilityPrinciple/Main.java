package LLD2.SolidDesignPrinciples.SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("John", 50000);

        SalaryCalculator calc = new SalaryCalculator();
        double salary = calc.calculateSalary(emp);

        ReportPrinter printer = new ReportPrinter();
        printer.print(emp, salary);
    }
}

