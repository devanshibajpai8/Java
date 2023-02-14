import java.util.Scanner;

public class pass {

    public static final int PASSWORD_LENGTH = 6;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Rules for writing a password:\n" +
                        "1. A password must have at least six characters.\n" +
                        "2. A password consists of only uppercase letters and digits\n" +
                        "3. A password must contain at least three digits \n" +
                        "Enter a password for yourself:\n");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH)
            return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch))
                numCount++;
            else if (is_Letter(ch))
                charCount++;
            else
                return false;
        }

        return (charCount >= 3 && numCount >= 3);
    }

    public static boolean is_Letter(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
