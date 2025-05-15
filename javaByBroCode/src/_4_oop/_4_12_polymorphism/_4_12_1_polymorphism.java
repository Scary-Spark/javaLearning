package _4_oop._4_12_polymorphism;

public class _4_12_1_polymorphism {
    public static void main(String[] args) {
        /*
            Polymorphism = "Poly" = "Many"
                           "Morph" = "Shape"

                           objects can identify as other objects
                           objects can be treated as objects of a common superclass
         */

        _4_12_3_polymorphismCar car = new _4_12_3_polymorphismCar();
        _4_12_4_polymorphismBike bike = new _4_12_4_polymorphismBike();
        _4_12_5_polymorphismBoat boat = new _4_12_5_polymorphismBoat();

        // as all of them are child of vehicle class so can make array of them
        _4_12_2_polymorphismVehicle[] vehicles = {car, bike, boat};

        for (_4_12_2_polymorphismVehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
