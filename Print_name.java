import java.util.Scanner;

class Print_name {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name:");
        String a = s.nextLine();
        System.out.print("Hello " + a + " nice to meet u");
        s.close();
    }
}
