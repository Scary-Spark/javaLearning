package _4_oop._4_10_abstraction;

public class _4_10_4_abstractionTriangle extends _4_10_2_abstractionShape {
    double base;
    double height;

    _4_10_4_abstractionTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
