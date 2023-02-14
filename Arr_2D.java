import java.util.Scanner;

class Arr_2D {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of 2D array:");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        System.out.print("enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Two dimensional array elements are");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(+a[i][j] + " ");
            }
        }
        System.out.println("\n2D array in matrix format:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
        s.close();
    }
}
