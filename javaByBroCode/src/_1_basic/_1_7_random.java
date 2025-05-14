package _1_basic;

import java.util.Random;

public class _1_7_random {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(1, 6);// between 1 to n-1
        System.out.println(n);

        double d = random.nextDouble(); // between 0 to 1
        System.out.println(String.format("%.2f", d));

        
        // something:
        /*
            if d = 0.234523434
            and i just want to assign as 0.23
            here how to do it:
         */

        double num = random.nextDouble();
        System.out.println("Num is: " + num);
        num = Math.round(num * 100) / 100.0; // make sure one is floating point
        System.out.println("New value: " + num);
    }
}
