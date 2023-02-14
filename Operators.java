import java.util.Scanner;

class Operators {
    public static void main(String args[]) {
        System.out.println("Enter the numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        // arithmetic operators
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a % b;
        int g = 9;
        g *= 7; // assignment operators
        System.out.println("Operations(add,sub,mul,mod):" + c + " " + d + " " + e + " " + f + " " + g);
        System.out.print("a less then b:");
        System.out.println(a < b);
        System.out.println("a equal to b");
        System.out.println(a == b); // comparison opeators
        System.out.println("a greater than b AND a is less than 100:");
        System.out.println(a > b && a < 100);
        System.out.println("a greater than b OR a is equal to b:");
        System.out.println(a > b || a == b);
        System.out.println("a XOR b:");
        System.out.println(a ^ b); // bitwise operator
        s.close();
    }

}
