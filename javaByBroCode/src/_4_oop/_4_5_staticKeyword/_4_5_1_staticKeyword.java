package _4_oop._4_5_staticKeyword;

public class _4_5_1_staticKeyword {
    public static void main(String[] args) {
         /*
        static = Makes a variable or method belongs to the class
                 rather than to any specific object

                 commonly used for utility methods or shared resources
     */

        _4_5_2_staticFriend friend1 = new _4_5_2_staticFriend("Tamim");
        _4_5_2_staticFriend friend2 = new _4_5_2_staticFriend("Shamim");

        System.out.println(friend1.numOfFriends); // print 1
        System.out.println(friend2.numOfFriends); // print 1
        // check friend class for reason

        System.out.println();

        System.out.println("Total friend: " + friend1.totalFriends);
        System.out.println("Total friend: " + friend2.totalFriends);
        _4_5_2_staticFriend friend3 = new _4_5_2_staticFriend("Musfiq");
        System.out.println("Total friend: " + friend3.totalFriends);
        _4_5_2_staticFriend friend4 = new _4_5_2_staticFriend("Karim");
        System.out.println("Total friend: " + friend4.totalFriends);
        System.out.println();


        // Static methods:
        MyUtils.greet(); // we can directly access to it

        //but, we can't do this
        // MyUtils.goodMorning();
        // for this we need to do it:
        MyUtils obj = new MyUtils(); // we need to create instance for that class
        obj.goodMorning();

        System.out.println();
        // same goes for different file. we don't need to call with instance, we can directly call with the class
        _4_5_2_staticFriend.showFriends();
    }
}

class MyUtils {
    public static void greet() {
        System.out.println("Hello World");
    }

    public void goodMorning() {
        System.out.println("Good morning");
    }
}
