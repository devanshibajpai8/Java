class student {
    // constructor is also used since the class name and function name is same
    static int roll = 0;
    String name;
    static String section = "IT-07";

    student(String n) {
        roll++;
        name = n;
        System.out.println(roll + " " + name + " " + section);
    }
}

public class static_var {
    public static void main(String[] args) {
        student11 s1 = new student11("deva");
        student11 s2 = new student11("ansh");
    }
}