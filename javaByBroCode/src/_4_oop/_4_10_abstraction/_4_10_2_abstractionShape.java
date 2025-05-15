package _4_oop._4_10_abstraction;

public abstract class _4_10_2_abstractionShape {

    // abstract class can have both abstract method and concrete method
    abstract double area();
    // this abstract method shouldn't have body

    // note if we declare abstract methods we must need to call that method in our child class.
    // or it will pass error
    // make sure to declare @Override


    // concrete methods:
    void display() {
        System.out.println("This is a shape");
    }
}
