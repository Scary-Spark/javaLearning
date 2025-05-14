package _1_basic;

import java.util.Scanner;

public class _1_4_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("enter your full-name: ");
        name = sc.nextLine(); // for line

        System.out.print("Enter first-name: ");
        String firstName = sc.next(); // for single word
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter gpa: ");
        float gpa = sc.nextFloat();

        System.out.println("Your name is: " + name);
        sc.close();
        System.out.println("Your first-name is: " + firstName);
        System.out.println("Your age is: " + age);


    }
}
