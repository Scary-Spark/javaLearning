package _3_array;

public class _3_3_2dArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "beef", "fish"};

        String[][] groceries =
                {
                        fruits,
                        vegetables,
                        meats,
                        {"apple", "samsung", "xiomi"}
                };

        for (String[] type : groceries) {
            for (String item : type) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }
}
