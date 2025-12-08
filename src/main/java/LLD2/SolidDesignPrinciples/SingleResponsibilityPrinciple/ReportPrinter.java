package LLD2.SolidDesignPrinciples.SingleResponsibilityPrinciple;


//Only prints reports
class ReportPrinter {
    public void print(Employee emp, double salary) {
        System.out.println("Employee Report: " + emp.name + " earns " + salary);
    }
}
