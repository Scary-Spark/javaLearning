package _4_oop._4_13_runtimePolymorphism;

import java.util.Scanner;

public class _4_13_1_runtimePolymorphism {
    public static void main(String[] args) {
        // also known as dynamic polymorphism

        /*
            when the method gets executed is decided at runtime based on  the actual type of the object
         */

        Scanner sc = new Scanner(System.in);

        _4_13_2_rtpAnimal animal;

        System.out.print("Would you like a dog or a cat? (1=Dog, 2=Cat): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            animal = new _4_13_3_rtpDog();
            animal.speak();
        } else if (choice == 2) {
            animal = new _4_13_4_rtpCat();
            animal.speak();
        }
    }
}
