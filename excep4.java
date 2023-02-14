
import java.util.Scanner;

public class excep4 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int n;
        {
            try {
                n = arr[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }

    }
}