package _1_basic;

public class _1_11_ternaryOperator {
    public static void main(String[] args) {

        // variable = (condition) ? ifTrue : ifFalse;
        int score = 70;

        String passOrFail = score >= 33 ? "You have passed" : "You have failed";
        System.out.println(passOrFail);
    }

}
