import java.util.Scanner;

public class sum_even_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        int c1 = 0;
        int c2 = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
                c1++;
            } else {
                odd += arr[i];
                c2++;
            }
        }
        s.close();
        System.out.println("even numbers:" + c1);
        System.out.println("odd numbers:" + c2);
        System.out.println("sum of even numbers:" + even);
        System.out.println("sum of odd numbers:" + odd);
    }

}
