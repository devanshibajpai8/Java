import java.util.Scanner;

public class stringhand1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        char de = s.next().charAt(0);
        System.out.println("length of first string:" + a.length());
        System.out.println("length of second string:" + b.length());
        System.out.println(a.equals(b));
        System.out.println(a.contains("v"));
        System.out.println(a.indexOf(de));
        for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
                System.out.print("not palindrome ");
            } else {
                System.out.print("palindrome ");
            }
        }
        System.out.print("\n" + a.toLowerCase());
        System.out.print("\n" + a.toUpperCase());

    }

}
