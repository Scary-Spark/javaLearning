package _4_oop._4_10_abstraction;

public class _4_10_5_abstractionRectangle extends _4_10_2_abstractionShape {
    double length;
    double width;

    _4_10_5_abstractionRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
