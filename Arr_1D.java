import java.util.Scanner;

public class Arr_1D {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of 1D array:");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("One dimensional array elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(+a[i]);
        }
        s.close();
    }
}