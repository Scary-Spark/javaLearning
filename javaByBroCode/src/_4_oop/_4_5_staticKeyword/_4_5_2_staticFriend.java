package _4_oop._4_5_staticKeyword;

public class _4_5_2_staticFriend {
    static int totalFriends; // not necessary to assign 0 in here
    String name;
    int numOfFriends = 0;

    _4_5_2_staticFriend(String name) {
        this.name = name;
        this.numOfFriends++;
        // here when we incrementing numOfFriends we actually incrementing for that instance (object) as a result it's 1 for all instance

        // this is why we use static key. by using static key we declaring that variable same for all the instances
        totalFriends++;
        // not we don't need to declare "this" keyword for static variable
    }

    static void showFriends() {
        System.out.println("You have total " + totalFriends + " friends");
    }
}
