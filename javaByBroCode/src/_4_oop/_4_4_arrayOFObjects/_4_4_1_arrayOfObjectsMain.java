package _4_oop._4_4_arrayOFObjects;

public class _4_4_1_arrayOfObjectsMain {
    public static void main(String[] args) {
        _4_4_2_aooCar car1 = new _4_4_2_aooCar("Mustang", "Red");
        _4_4_2_aooCar car2 = new _4_4_2_aooCar("Corvette", "Blue");
        _4_4_2_aooCar car3 = new _4_4_2_aooCar("Charger", "Green");

        _4_4_2_aooCar[] cars = {
                car1,
                car2,
                car3,
                new _4_4_2_aooCar("Lamborghini", "Black"),
                new _4_4_2_aooCar("Toyota", "Gray"),
                new _4_4_2_aooCar("Tesla", "Meka-Dark")
        };
        
        for (_4_4_2_aooCar car : cars) {
            car.drive();
        }

    }
}
