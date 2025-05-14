package _4_oop._4_3_overloadedConstructor;

public class _4_3_2_olcUser {

    String userName;
    String email;
    int age;

    _4_3_2_olcUser(String userName) {
        this.userName = userName;
        this.email = "Not provided";
        this.age = -1;
    }

    _4_3_2_olcUser(int age) {
        this.userName = "Null";
        this.email = "Not given";
        this.age = age;
    }

    _4_3_2_olcUser(String name, String email, int age) {
        this.userName = name;
        this.email = email;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Username: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age);
    }

}
