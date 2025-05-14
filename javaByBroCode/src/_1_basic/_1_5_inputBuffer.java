package _1_basic;

import java.util.Scanner;

public class _1_5_inputBuffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // way one: using sc.nextLine() after int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        //disadvantage: if you take int and string input in same line then another issue

        // another way
        System.out.print("Enter you friend age: ");
        age = Integer.parseInt(sc.next());
        System.out.print("Enter your friend name: ");
        name = sc.nextLine();
        System.out.println(name + " is " + age + " years old");

        sc.close();

    }
}
