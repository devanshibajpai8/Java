class Pink {
    void display() {
        System.out.println("Colour is pink");
    }
}

class Red extends Pink {
    void display() {
        System.out.println("Colour is red");
    }
}

class Blue extends Pink {
    void display() {
        System.out.println("Colour is blue");
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        Pink p = new Pink();
        Red r = new Red();
        Blue b = new Blue();
        Pink w;
        w = p;
        w.display();
        w = r;
        w.display();
        w = b;
        w.display();
    }
}
