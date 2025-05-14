package _3_array;

import java.util.Scanner;

public class _3_2_arrayUserInput {
    public static void main(String[] args) {
        String[] fruits = new String[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Fruit " + (i + 1) + ": ");
            fruits[i] = sc.nextLine();
            // push_back can't be used in here
        }

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
    }
}
