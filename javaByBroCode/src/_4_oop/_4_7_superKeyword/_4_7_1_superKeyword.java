package _4_oop._4_7_superKeyword;

public class _4_7_1_superKeyword {
    public static void main(String[] args) {

        /*
            Super = Refers to the parent class (sub class <- superclass)
                    used in constructors and methods overloading

                    Calls the parent constructor to initialize attributes
         */

        _4_7_2_superPerson person1 = new _4_7_2_superPerson("Tony", "Stark");
        person1.showName();
        System.out.println();

        _4_7_3_superStudent student1 = new _4_7_3_superStudent(
                "Scary",
                "Spark",
                3.85
        );
        student1.studentInfo();
    }
}
