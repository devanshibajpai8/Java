class Super {
    void set() throws RuntimeException {

        System.out.println("superclass");

    }
}

class Sub extends Super {
    void set() throws RuntimeException {
        System.out.println("subclass");
    }
}

public class exception2 {
    public static void main(String args[]) {
        Sub s = new Sub();
        s.set();
    }
}
