package _4_oop._4_11_interface;

public class _4_11_5_interfaceFish implements _4_11_2_interfacePrey, _4_11_3_interfacePredator {

    @Override
    public void flee() {
        System.out.println("Fish is fleeing from bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting smaller fish");
    }
}
