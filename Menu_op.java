import java.util.Scanner;

class Menu_op {
    public static void main(String args[]) {
        System.out.print("Enter the first numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter the second numbers:");
        int b = s.nextInt();
        System.out.print("1)Addition\n2)Subtraction\n3)Divison\n4)Multiplication\n5)Exit");
        lp: while (true) {
            System.out.print("\nEnter the choice:");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    int c = a + b;
                    System.out.print("Addition is:" + c);
                    break;

                case 2:
                    int w = a - b;
                    System.out.print("Subtraction is:" + w);
                    break;

                case 3:
                    int r = a / b;
                    System.out.print("Division is:" + r);
                    break;

                case 4:
                    int y = a * b;
                    System.out.print("Multiplication is:" + y);
                    break;
                case 5:
                    System.out.println("You have exited");
                    break lp;

                default:
                    System.out.println("enter a valid input");
            }
        }
    }

}
