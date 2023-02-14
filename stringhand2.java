import java.util.Scanner;

public class stringhand2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        a = String.join(" ", "devanshi", "bajpai");
        System.out.println(a);
        System.out.println(a.isEmpty());
        System.out.println(a.replace('i', 'o'));
        String[] result = a.split(" ");
        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
        String sd = null;
        sd = a.substring(1, 3);
        System.out.println("\n" + sd);
    }

}
