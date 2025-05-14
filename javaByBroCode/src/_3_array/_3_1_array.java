package _3_array;

import java.util.Arrays;

public class _3_1_array {
    public static void main(String[] args) {

        String[] fruits = {
                "orange",
                "banana",
                "apple",
        };

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
        System.out.println();

        System.out.println(fruits.length);

        // sort the list
        Arrays.sort(fruits);

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }

        // fill with any value:
        Arrays.fill(fruits, "tt");


    }
}
