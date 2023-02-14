import java.util.Scanner;

class toytot {
    int toyid;
    String toyname;
    int toyqnty;
    int toyprice;
    Scanner p = new Scanner(System.in);

    void details() {
        System.out.print("enter the id of toy:");
        toyid = p.nextInt();
        System.out.print("enter the name of toy:");
        toyname = p.next();
        System.out.print("enter the quantity of toy:");
        toyqnty = p.nextInt();
        System.out.print("enter the price of the toy:");
        toyprice = p.nextInt();
        System.out.println(" ");
        System.out.println(" ");
    }

    void display() {
        System.out.println("Toy Id:" + toyid);
        System.out.println("Toy name:" + toyname);
        System.out.println("Toy quantity:" + toyqnty);
        System.out.println("Toy price" + toyprice);
    }

    int tot() {
        int total = 0;
        total = total + toyqnty * toyprice;
        return total;
    }

}

public class toy {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of toys:");
        int n = s.nextInt();
        toytot[] obj = new toytot[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new toytot();
        }
        for (int i = 0; i < n; i++) {
            obj[i].details();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of toy " + i + " :");
            obj[i].display();
            System.out.println(" ");
            System.out.println(" ");
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            r = r + obj[i].tot();
        }
        System.out.println("Bill amount is:" + r);

        s.close();
    }
}
