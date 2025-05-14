package _2_methods;

public class _2_3_varargs {
    public static void main(String[] args) {
        /*
            varargs = variable argument
            varargs = allow a method to accept a varying no of arguments
         */
        System.out.println("Sum of the nums: " + sumOfNums(2, 3, 1, 6));
        System.out.println("Sum of nums: " + sumOfNums(1, 2, 3, 4, 5, 6, 7, 8));
        // here we directly passing elements rather than using array. as well as array size doesn't matter
    }

    static int sumOfNums(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
