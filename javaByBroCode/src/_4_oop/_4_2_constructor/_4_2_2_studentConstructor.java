package _4_oop._4_2_constructor;

public class _4_2_2_studentConstructor {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // in order to make constructor we need to declare method as the same name of the class
    _4_2_2_studentConstructor(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;   // here this.name is indicating the name declared inside the class,
        // and the name after the equal sign is the declared name inside the method
        /*
            when we constructing student1 this is replaced with the name of the object (student1)
         */

        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gpa: " + this.gpa);
        System.out.println("Is enrolled: " + this.isEnrolled);
    }
}
