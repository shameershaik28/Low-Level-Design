package LLD2.SolidDesignPrinciples.SingleResponsibilityPrinciple;

//Only holds data
class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

