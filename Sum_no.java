import java.util.Scanner;

class Sum_no {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("sum:" + sum);
        sc.close();
    }
}
