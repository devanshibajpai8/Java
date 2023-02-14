class addition {
    int u = 8, v = 5;

    void add() {
        System.out.println("Summation is:" + (u + v));
    }

    void add(int a, int b) {
        System.out.println("Summation is:" + (a + b));
    }

    void add(int a, float b) {
        System.out.println("Summation is:" + (a + b));
    }

    void add(float a, int b) {
        System.out.println("Summation is:" + (a + b));
    }
}

public class overloading {
    public static void main(String[] args) {
        addition obj = new addition();
        obj.add();
        obj.add(7, 4);
        obj.add(8, 4.9f);
        obj.add(3.7f, 9);
    }
}
