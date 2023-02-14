import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int temp;
        int[] even = new int[n];
        int[] odd = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[i] = arr[i];

            } else {
                odd[i] = arr[i];
            }
        }
        s.close();
        for (int i = 0; i < odd.length; i++) {
            for (int j = i + 1; j < odd.length; j++) {
                if (odd[i] > odd[j]) {
                    temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;

                }
            }
        }

        for (int i = 0; i < even.length; i++) {
            for (int j = i + 1; j < even.length; j++) {
                if (even[i] > even[j]) {
                    temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
        }
    }
}
