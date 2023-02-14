import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputstream_add {
    public static void main(String[] args) throws Exception {
        System.out.print("enter the two numbers:");
        BufferedReader or = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(or.readLine());
        int b = Integer.parseInt(or.readLine());
        int c = a + b;
        System.out.print("The sum of two numbers is:");
        System.out.println(c);
    }
}
