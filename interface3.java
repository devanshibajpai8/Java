interface A {
    void meth1();

    void meth2();
}

interface B extends A {
    void meth3();
}

class student implements B {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

class interface3 {
    public static void main(String args[]) {
        student o = new student();
        o.meth1();
        o.meth2();
        o.meth3();
    }
}
