package _1_basic;

public class _1_18_finalKeyword {
    static final int num1 = 5;
    static int num2 = 8;

    public static void main(String[] args) {
        System.out.println("Num1 : " + num1);
        System.out.println("Num1 : " + num2);

        changeNum();
        System.out.println("\nAfter method call: ");
        System.out.println("Num1 : " + num1);
        System.out.println("Num1 : " + num2);

    }

    static void changeNum() {

        // we can't write num1
        //num1 = 9;

        num2 = 10;
    }
}
