package _1_basic;

public class _1_9_flags {
    public static void main(String[] args) {

        // %[flags][width][.precision][specifier-character]

        /*
            Flags:
                 1. +      : output a plus (if positive)
                 2. ,      : comma grouping separator
                 3. (      : negative numbers are enclosed in ()
                 4. space  : display a minus if negative, space if positive
         */

        int a = 34, b = 23, c = -95, d = 62347, e = -12;

        System.out.printf("%+d\n", a);
        System.out.printf("% ,(d\n", b);
        System.out.printf("% ,(d\n", c);
        System.out.printf("% ,(d\n", d);
        System.out.printf("% ,d\n", e);
        System.out.println();

        /*
            Width:
                 1. 0number      : zero padding
                 2. number  : right justified padding
                 3. negative number : left justified padding
         */

        a = 234;
        b = 768;
        c = 78;
        System.out.printf("%05d\n", a);
        System.out.printf("%5d\n", b); // print upto 5 digit. left all will be space
        System.out.printf("%-5d", c); // upto 5 . but right empty space will be space
        System.out.println("Test");
    }
}
