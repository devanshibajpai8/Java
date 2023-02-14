import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String s) {
        super(s);
    }
}

class MinException extends Exception {
    MinException(String s) {
        super(s);
    }
}

class SecException extends Exception {
    SecException(String s) {
        super(s);
    }
}

class Time {
    int hrs, min, sec;

    Time(hrs)
}

public class pa1 {
    public static void main(String args[]) {
        Ar o = new Ar();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        try {
            o.processinput(n);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
        System.out.println("done");

    }
}