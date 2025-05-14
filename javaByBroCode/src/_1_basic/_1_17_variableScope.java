package _1_basic;

public class _1_17_variableScope {
    static int num = 34;
    static int num2 = 67;

    public static void main(String[] args) {

        int x = 12;
        // here x is local variable if main function/method
        System.out.println("Value of num: " + num);

        fun();
        System.out.println("Value of num after method call: " + num);
        // value changed. because it is global variable

        // if we use same variable name as global variable it will use the local one
        int num2 = 90;
        fun2();
        System.out.println("Num2 is: " + num2);
    }

    static void fun() {
        // here we can't call x. but we can call num and change it's value
        num = 23;
    }

    static void fun2() {
        num2 = 100;
    }
}
