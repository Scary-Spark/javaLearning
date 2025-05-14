package _4_oop._4_7_superKeyword;

public class _4_7_3_superStudent extends _4_7_2_superPerson {
    double gpa;

    _4_7_3_superStudent(String first, String last, double gpa) {
        super(first, last); // it will send the first and last to it's parent class

        this.gpa = gpa;
    }

    void studentInfo() {
        System.out.println("Name: " + this.first + " " + this.last);
        System.out.println("Gpa: " + this.gpa);
    }

}
