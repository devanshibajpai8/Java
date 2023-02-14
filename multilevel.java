import java.util.Scanner;

class plate {
    int l, b;
    int area;

    plate() {
        System.out.print("enter the length and breadth:");
        Scanner s = new Scanner(System.in);
        l = s.nextInt();
        b = s.nextInt();
        area = l * b;
    }
}

class box extends plate {
    int h;
    int area_box;

    box() {
        System.out.print("enter the height:");
        Scanner s = new Scanner(System.in);
        h = s.nextInt();
        area_box = l * b * h;
    }
}

class woodbox extends box {
    int t;
    int area_wb;

    woodbox() {
        System.out.print("enter the thickness:");
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        area_wb = l * b * h * t;
        s.close();
    }

    void display() {
        System.out.println("area of plate:" + area);
        System.out.println("area of box:" + area_box);
        System.out.println("area of woodbox:" + area_wb);
    }
}

public class multilevel {
    public static void main(String[] args) {
        woodbox w = new woodbox();
        w.display();
    }
}
