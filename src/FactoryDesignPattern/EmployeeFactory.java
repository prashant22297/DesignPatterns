package FactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Java Developer")) {
            return new JavaDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
