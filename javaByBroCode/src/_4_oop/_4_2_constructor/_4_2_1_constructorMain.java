package _4_oop._4_2_constructor;

public class _4_2_1_constructorMain {
    public static void main(String[] args) {
        /*
            constructor = A special method to initialize objects
                          We can pass arguments to constructor
                          and set up initial values
         */


        _4_2_2_studentConstructor student1 = new _4_2_2_studentConstructor(
                "Scary Spark",
                21,
                3.83,
                true
        );

        _4_2_2_studentConstructor student2 = new _4_2_2_studentConstructor(
                "Bro code",
                30,
                4.00,
                false
        );
        System.out.println("Address of student 1: " + student1);
        System.out.println("Address of student 2: " + student2);

        System.out.println();
        student1.printInfo();
        System.out.println();
        student2.printInfo();
    }
}
