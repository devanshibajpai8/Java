import java.util.Scanner;

class logic {
    int temp, last, digit_count = 0;

    boolean isArmstong(int x) {
        temp = x;
        while (temp > 0) {
            temp = temp / 10;
            digit_count++;
        }
        temp = x;
        int sum = 0;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digit_count);
            temp = temp / 10;
        }
        return (x == sum ? true : false);
    }

    boolean isHarshad(int p) {
        temp = p;
        temp = p;
        int sum = 0;
        while (temp > 0) {
            last = temp % 10;
            sum += last;
            temp = temp / 10;
        }
        return (p % sum == 0 ? true : false);
    }
}

class Armstrong_harshad {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = n.nextInt();
        logic obj;
        obj = new logic();
        System.out.println("Whether Armstrong:" + obj.isArmstong(num));
        System.out.println("Whether Harshad:" + obj.isHarshad(num));
        n.close();
    }
}