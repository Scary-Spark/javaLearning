package _4_oop._4_11_interface;

public class _4_11_4_interfaceRabbit implements _4_11_2_interfacePrey {

    @Override
    public void flee() {
        // in interface all methods are public,
        // so we need to declare public in here
        System.out.println("Rabbit is running away");
    }
}
