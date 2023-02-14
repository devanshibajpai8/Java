public class Fina {
    static int ad = 100;
    static int bc = 200;
    static {
        ad += 1;
        bc += 1;
    }

    public static void main(String args[]) {
        ad += 5;
        bc += 10;
        System.out.println(ad + bc);
    }

    static {
        ad += 100;
        bc += 200;
    }
}