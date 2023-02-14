interface inter1 {
    void disp();
}

class student implements inter1 {
    public void disp() {
        System.out.println("interface:");
    }

    public void nonifacemethod() {
        System.out.println("non-interface:");

    }
}

class interface2 {
    public static void main(String args[]) {
        student o = new student();
        o.disp();
        o.nonifacemethod();
        inter1 ob;
        ob = o;
        ob.disp();
        // ob.nonifacemethod();
    }

}
