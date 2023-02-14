
class A {
    A() {
        System.out.println("default constructore of parent class");
    }

    A(int r, int b) {
        int sum;
        sum = r + b;
        System.out.println("sum:" + sum);
    }
}

class B extends A {
    B(int a) {
        System.out.println("para");
    }

    B() {
        super(2, 4);
        System.out.println("constructor of child class");
    }

    void display() {
        System.out.println("inheritance");
    }
}

public class inheritance_super {
    int a;

    public static void main(String[] args) {
        B e = new B();
        B u = new B(8); // this will call default constructor of base class and para constructor of its
                        // own class
        // u.display();

    }
}
