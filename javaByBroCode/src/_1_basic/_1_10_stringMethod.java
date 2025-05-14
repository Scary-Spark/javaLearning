package _1_basic;

public class _1_10_stringMethod {
    public static void main(String[] args) {
        String name = "   Bro Code    Brother   ";

        System.out.println("Length is: " + name.length());
        System.out.println("Char at index 2: " + name.charAt(2));

        System.out.println("First occurance of C: " + name.indexOf('C'));
        // can also be for SubString

        System.out.println("Last occur of B: " + name.lastIndexOf('B'));

        System.out.println("Upper case: " + name.toUpperCase());
        // NOTE:  here we calling name inside print. so the actual value of name is not changed
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("actual value: " + name);

        //remove the empty space from first and last
        System.out.println("After trim: " + name.trim());

        // replace any character
        System.out.println("Replace B with T: " + name.replace('B', 'T'));

        // replace Sub string
        System.out.println("replace bro with madam: " + name.replace("Bro", "Madam"));
        // note: it will replace any substring match

        System.out.println("If name is empty? " + name.isEmpty());

        // if contain substring
        System.out.println("If contain bro? " + name.contains("Bro"));

        // equals method
        System.out.println("Is name equal Scary Spark? " + name.equals("Scary Spark"));

        System.out.println("Ignore Case: " + name.equalsIgnoreCase("   bRo code    broTheR   "));
        System.out.println();

        // Sub String
        String email = "bro123@gmail.com";
        String userName = email.substring(0, 6); // index 0 to n-1
        System.out.println("Username: " + userName);

        // dynamic
        userName = email.substring(0, email.indexOf('@'));
        System.out.println("User name" + userName);
        String domain = email.substring(email.indexOf('@') + 1, email.length()); // we can also remove the email.length in here
        System.out.println("Domain: " + domain);
    }


}
