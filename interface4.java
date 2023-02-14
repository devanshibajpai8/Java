class shape {
    public void area() {
    }
}
interface inter1 {
    void disp();
}

class student extends shape implements inter1 {
    public void disp() {
        System.out.println("interface");
    }

    public void area() {
        System.out.println("araea is");
    }
}

class interface4 {
    public static void main(String args[]) {
        student o = new student();
        o.disp();
        o.area();
    }
}
