import java.util.Scanner;

class account {
    int acc_no;
    int balance;

    void display() {
        System.out.println("Account no:" + acc_no);

    }
}

class person extends account {
    String name;
    int aadhar_no;
    Scanner p = new Scanner(System.in);

    void details() {
        System.out.print("enter the account number:");
        acc_no = p.nextInt();
        System.out.print("enter the name of person:");
        name = p.next();
        System.out.print("enter the balance:");
        balance = p.nextInt();
        System.out.print("enter the aadhar number:");
        aadhar_no = p.nextInt();
        System.out.println(" ");
        System.out.println(" ");
    }

    void display() {
        System.out.println("Account no:" + acc_no);
        System.out.println("Name:" + name);
        System.out.println("balance:" + balance);
        System.out.println("Aadhar number:" + aadhar_no);
    }
}

public class acc {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of persons:");
        int n = s.nextInt();
        person[] obj = new person[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new person();
        }
        for (int i = 0; i < n; i++) {
            obj[i].details();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Person " + i + " :");
            obj[i].display();
            System.out.println(" ");
            System.out.println(" ");
        }
        s.close();
    }
}
