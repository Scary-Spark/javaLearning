package _4_oop._4_10_abstraction;

public class _4_10_1_abstraction {
    public static void main(String[] args) {
        /*
            abstract = used to define abstract class and methods.
                       abstraction is the process of hiding implementation details
                       and showing only the essential features.
                       Abstract classes can't be instantiated directly
                             (meaning we can't create a object of that class directly).
                       can obtain abstract methods(which must be implemented).
                       can obtain 'concrete' methods (which are inherited).

             simply:
                Think of a tv remote:
                    you don't know how it works internally
                    you just press a button and it does the job.
                    That's abstraction - hiding the complex logic and exposing only what you need.

           abstract method:
                i promise this method will exist, but  you have to finish it. This method doesn't has body in it

           concrete method:
                Here's a ready-to-use method you can use or override it. (it's the simple method that we declare)

            note:
                variable can't be abstract
         */


        // here we can't directly create object of that class as it is abstract class
        // _4_10_2_abstractionShape shape = new _4_10_2_abstractionShape();

        _4_10_3_abstractionCircle circle = new _4_10_3_abstractionCircle(3.5);
        _4_10_4_abstractionTriangle triangle = new _4_10_4_abstractionTriangle(3, 5);
        _4_10_5_abstractionRectangle rectangle = new _4_10_5_abstractionRectangle(2.5, 4.7);

        // we can call the concrete methods directly using child class:
        circle.display();
        System.out.println();
        
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
