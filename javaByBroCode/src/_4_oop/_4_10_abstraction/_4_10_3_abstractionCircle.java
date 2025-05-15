package _4_oop._4_10_abstraction;

public class _4_10_3_abstractionCircle extends _4_10_2_abstractionShape {

    double radius;

    _4_10_3_abstractionCircle(double radius) {
        this.radius = radius;
    }

    @Override
        // as it is also a override method as well as abstract
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
