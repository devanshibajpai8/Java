import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[12];
        int[] arrs = new int[12];
        System.out.println("enter the lower bound:");
        int a = s.nextInt();
        System.out.println("enter the upper bound:");
        int n = s.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < 12; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            if (a < arr[i] < n) {
                arrs[i] = arr[i];
            }
        }
        int temp;
        int[] even = new int[12];
        int[] odd = new int[12];
        for (int i = 0; i < 12; i++) {
            if (arrs[i] % 2 == 0) {
                even[i] = arrs[i];

            } else {
                odd[i] = arrs[i];
            }
        }
        s.close();
        System.out.println("elemensts:");
        for (int i = 0; i < odd.length; i++) {
            for (int j = i + 1; j < odd.length; j++) {
                if (odd[i] > odd[j]) {
                    temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
            System.out.print(+odd[i] + " ");
        }
        for (int i = 0; i < even.length; i++) {
            for (int j = i + 1; j < even.length; j++) {
                if (even[i] > even[j]) {
                    temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
            System.out.println(+even[i] + " ");
        }

    }
}
