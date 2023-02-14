import java.util.Scanner;

public class Grade_subject {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of subjects:");
        int a = s.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("enter the marks of subject" + i + ":");
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        int avg = sum / a;
        if (avg > 90 && avg < 100) {
            System.out.println("Grade O");
        }
        if (avg > 80 && avg < 90) {
            System.out.println("Grade is E");
        }
        if (avg > 70 && avg < 80) {
            System.out.println("Grade is A");
        }
        if (avg > 60 && avg < 70) {
            System.out.println("Grade is B");
        } else {
            System.out.println("FAIL");
        }
        s.close();

    }

}
