package FactoryDesignPattern;

public class JavaDeveloper implements Employee {
    @Override
    public String designation() {
        return "Java Developer";
    }

    @Override
    public int salary() {
        return 1;
    }
}
