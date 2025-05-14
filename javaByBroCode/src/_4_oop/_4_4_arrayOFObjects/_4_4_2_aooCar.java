package _4_oop._4_4_arrayOFObjects;

public class _4_4_2_aooCar {
    String model;
    String color;

    _4_4_2_aooCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
