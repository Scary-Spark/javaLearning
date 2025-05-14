package _4_oop._4_3_overloadedConstructor;

public class _4_3_1_overloadedConstructorMain {
    public static void main(String[] args) {
        // overloaded constructor is same as overloaded methods

        _4_3_2_olcUser user1 = new _4_3_2_olcUser("Scary_Spark");
        _4_3_2_olcUser user2 = new _4_3_2_olcUser(34);
        _4_3_2_olcUser user3 = new _4_3_2_olcUser(
                "Bro_Code",
                "bro123@idk.com",
                43
        );

        user1.printInfo();
        System.out.println();
        user2.printInfo();
        System.out.println();
        user3.printInfo();
    }
}
