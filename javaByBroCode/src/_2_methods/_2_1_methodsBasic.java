package _2_methods;

public class _2_1_methodsBasic {
    public static void main(String[] args) {
        happyBirthday("Rahim");

        int age = 12;
        changeAge(age);
        System.out.println("Age after method call: " + age);
        // it doesn't change anything

    }

    static void happyBirthday(String name) {
        System.out.println(name + " Happy Birthday to you");
    }

    static void changeAge(int age) {
        age = 15;
    }

    // calling a method from which is static the called method also should be static

}
