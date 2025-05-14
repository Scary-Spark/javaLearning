package _4_oop._4_7_superKeyword;

public class _4_7_2_superPerson {

    String first;
    String last;

    _4_7_2_superPerson(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
