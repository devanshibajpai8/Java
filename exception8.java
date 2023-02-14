import javax.naming.NamingException;

public class exception8 {
    public static void main(String args[]) {
        try {
            System.out.println("in try block");
            int a = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("exception occured " + e);
        } finally {
            System.out.println("finally executed");
        }
    }

}
