class A {
    public void display() {
        System.out.println("In class A");
    }
}

class B extends A {
    public void display() {
        System.out.println("In class B");
    }
}

class C {
    protected void display() {
        System.out.println("In class C");
    }
}

class E extends C {
    public void display() {
        System.out.println("In class E");
    }
}

class D {
    private void display() {
        System.out.println("In class D");
    }
}

class F extends D {
    public void display() {
        System.out.println("In class F");
    }
}

public class overridding {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.display();
        C c = new C();
        c.display();
        E e = new E();
        e.display();
        F f = new F();
        f.display();
    }
}