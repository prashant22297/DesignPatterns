package FactoryDesignPattern;

public class EmployeeClient {
    public static void main(String[] args) {
//        Employee employee = new AndroidDeveloper();
//        System.out.println(employee.designation());

        Employee employee = EmployeeFactory.getEmployee("Java Developer");
        System.out.println(employee.designation() + " " + employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("WEb Developer ");
        System.out.println(employee1.designation() + " " + employee1.salary());
    }
}
