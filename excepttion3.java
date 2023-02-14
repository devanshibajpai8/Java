import java.util.Scanner;

public class excepttion3 {
    public static void main(String args[]) {
        String a;
        a = null;
        try {
            if (a.length() == 0)
                ;
        } catch (NullPointerException e) {
            System.out.print("exception occured:" + e);
        }
    }
}
