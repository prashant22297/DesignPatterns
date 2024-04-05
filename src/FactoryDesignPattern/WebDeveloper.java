package FactoryDesignPattern;

public class WebDeveloper implements Employee {
    @Override
    public String designation() {
        return "Web Developer";
    }
    
    @Override
    public int salary() {
        return 3;
    }
}
