package _2_methods;

public class _2_2_overloadMethod {
    public static void main(String[] args) {
        // overload method = has same name but different parameter

        String name = "Spark";
        int age = 21;

        System.out.print("Call 1\n");
        name(name);
        System.out.println();

        System.out.print("Call 2\n");
        name(age);
        System.out.println();

        System.out.print("Call 3\n");
        name(name, age);
        System.out.println();
    }

    static void name(String name) {
        System.out.println("Your name is: " + name);
    }

    static void name(int age) {
        System.out.println("Your age is: " + age);
    }


    static void name(String name, int age) {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}
