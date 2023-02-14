class sub {
    int u = 8, v = 4, p;

    sub() {
        p = u - v;
        System.out.println("Substraction is:" + p);
    }

    sub(int a, int b) {

        System.out.println("Substraction is:" + (a - b));
    }

    sub(int a, int b, int c) {

        System.out.println("Substraction is:" + (a - b - c));
    }

    // Variable argument
    sub(int... ar) {
        int p = 0;
        for (int a : ar) {
            p -= a;
        }
        System.out.println("Substraction is:" + p);
    }
}

public class constructor {
    public static void main(String[] args) {
        new sub();
        new sub(4, 9);
        new sub(8, 5, 4);
        new sub(-7, 2, 6, 4, 5);

    }
}