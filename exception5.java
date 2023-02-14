import java.util.Scanner;

class Arr {
    void processinput(int a) throws NegativeNumberException {
        if (a < 0)
            throw new NegativeNumberException("Number is Negative Number");
        else
            System.out.println("The Number " + a + " is Positive");
    }
}

public class exception5 {
    public static void main(String args[]) {
        Arr ar = new Arr();
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int input = sc.nextInt();
            sc.close();
            ar.processinput(input);
        } catch (NegativeNumberException e) {
            System.out.println("Exception occured" + e);
        }
        System.out.println("Done ! ");
    }
}
