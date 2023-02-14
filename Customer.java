import java.util.Scanner;

class Cust {
    String custname;
    int custage;
    int custpack;
    Scanner p = new Scanner(System.in);

    void details() {
        System.out.print("enter the name of the customer:");
        custname = p.nextLine();
        System.out.print("enter the age of customer:");
        custage = p.nextInt();
        System.out.print("enter the package:");
        custpack = p.nextInt();
    }

    void display() {
        System.out.println("customer name:" + custname);
        System.out.println("customer age:" + custage);
        System.out.println("customer package:" + custpack);
    }

}

public class Customer {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of employees:");
        int n = s.nextInt();
        Cust[] obj = new Cust[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Cust();
        }
        for (int i = 0; i < n; i++) {
            obj[i].details();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of employee " + i + " :");
            obj[i].display();
            System.out.println(" ");
            System.out.println(" ");
        }
        s.close();
    }
}
