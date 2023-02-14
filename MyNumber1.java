import java.util.Scanner;

class mynumberDem {

    int value;

    void setvalue(int n) {
        value = n;
        System.out.println("The value is " + value);
    }

    Boolean iseven() {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    int findfactorial(int value) {
        if (value == 1)
            return 1;
        return (value * findfactorial(value - 1));
    }

    Boolean isprime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    int findsumofdigits() {
        int sum = 0;
        for (int j = 1; j <= value; j++) {
            sum = sum + j;
        }
        return sum;
    }

}

class MyNumber1 {
    public static void main(String[] args) {
        System.out.print("Enter the number for evaluation:");
        Scanner n = new Scanner(System.in);
        int num;
        num = n.nextInt();
        mynumberDem obj;
        obj = new mynumberDem();
        obj.setvalue(num);
        System.out.println("Number is even:" + obj.iseven());
        System.out.println("The factorial:" + obj.findfactorial(num));
        System.out.println("Prime(true or false):" + obj.isprime());
        System.out.println("THe sum of digits:" + obj.findsumofdigits());
        n.close();
    }
}
