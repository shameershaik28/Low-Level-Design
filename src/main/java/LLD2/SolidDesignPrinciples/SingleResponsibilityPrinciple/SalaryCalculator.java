package LLD2.SolidDesignPrinciples.SingleResponsibilityPrinciple;

//Only calculates salary
class SalaryCalculator {
    public double calculateSalary(Employee emp) {
        return emp.baseSalary * 1.2; // bonus added
    }
}

