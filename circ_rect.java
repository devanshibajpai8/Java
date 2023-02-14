import java.util.Scanner;

class shape {
    void showarea(double area) {
        System.out.println("area is:" + area);
    }
}

class circle extends shape {
    double areacir;

    double areacircle() {
        System.out.print("enter the radius:");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        areacir = 3.14 * r * r;
        return areacir;
    }
}

class rectangle extends shape {
    double arearec;

    double arearect() {
        System.out.print("enter the length and breadth:");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        arearec = l * b;
        return arearec;
    }
}

public class circ_rect {
    static double q;
    static double p;

    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();
        p = c.areacircle();
        c.showarea(p);
        q = r.arearect();
        r.showarea(q);

    }
}
