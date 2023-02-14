import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputstreamreader {
    public static void main(String[] args) throws Exception {
        BufferedReader or = new BufferedReader(new InputStreamReader(System.in));
        String n = or.readLine();
        System.out.println(n);
        int f = Integer.parseInt(or.readLine());
        System.out.println(f);
        float t = Float.parseFloat(or.readLine());
        System.out.println(t);
    }

}
