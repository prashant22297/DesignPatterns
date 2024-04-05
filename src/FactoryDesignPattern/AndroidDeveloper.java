package FactoryDesignPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public String designation() {
        return "Android Developer";
    }

    @Override
    public int salary() {
        return 2;
    }
}
