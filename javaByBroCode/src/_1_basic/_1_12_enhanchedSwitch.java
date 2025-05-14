package _1_basic;

public class _1_12_enhanchedSwitch {
    public static void main(String[] args) {
        // a replacement of if else (over jave 14)

        String day = "monday";

        switch (day) {  // this is for single statement only
            case "monday" -> System.out.println("Is monday");
            case "sunday", "saturday", "friday" -> System.out.println("Is sunday");
        }

        switch (day) {
            case "monday", "thursday":
                System.out.println("Today is monday");
                System.out.println("You can go out");
                break;
            case "sunday":
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }


    }
}
