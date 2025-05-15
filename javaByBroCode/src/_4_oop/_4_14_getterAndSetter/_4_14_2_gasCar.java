package _4_oop._4_14_getterAndSetter;

public class _4_14_2_gasCar {
    private final String model;
    private String color;
    private int price;

    _4_14_2_gasCar(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setPrice(int price) {
        this.price = price;
    }


}
