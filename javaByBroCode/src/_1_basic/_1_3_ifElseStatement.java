package _1_basic;

public class _1_3_ifElseStatement {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 18)
            System.out.println("You can vote");
        else if (age >= 15)
            System.out.println("You need more age buddy");
        else
            System.out.println("You are still a child");
    }
}
