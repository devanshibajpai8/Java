interface inter {
    int x = 10;

    void disp();
}

class student implements inter {
    public void disp() {
        System.out.println("interface:" + x);
    }
}

class interface1 {
    public static void main(String args[]) {
        student o = new student();
        // x=20;
        o.disp();
        // System.out.println("x:"+x);
    }
}
