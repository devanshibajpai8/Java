import java.util.Scanner;

public class execption1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int data = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        s.close();
    }

}
