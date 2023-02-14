
class A {
    A() {
        System.out.println("Default");
    }

    A(int a) {
        System.out.println("Parametrised");
    }
}

class B extends A {
    B(int b) {
        super(b);
        System.out.println("Class b");
    }
}

public class Super2 {
    public static void main(String[] args) {
        // default constructor of base class will be called
        B r = new B(6); // since super keyword is present in constructor of class B so parametrised
                        // constructor of child class will be called

    }
}