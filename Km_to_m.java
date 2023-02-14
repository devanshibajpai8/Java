import java.util.Scanner;

class Km_to_m {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value in KM:");
        int a = s.nextInt();
        int b = a * 1000;
        System.out.println("Value " + a + " in meter is:" + b);
        System.out.print("Enter the answer:");
        boolean c = s.hasNextInt();
        System.out.print("Answer is Int(true/false): " + c);
        s.close();

    }

}
