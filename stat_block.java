class employee {
    int emp_id;
    String name;
    static String company = "IBM";

    static void change() {
        company = "Google";
    }

    employee(int r, String n) {
        emp_id = r;
        name = n;
    }

    void display() {
        System.out.println(emp_id + " " + name + " " + company);
    }
}

public class stat_block {
    static {
        System.out.println("HIRED");
    }

    public static void main(String[] args) {
        employee.change();
        employee s1 = new employee(1, "Devanshi");
        employee s2 = new employee(2, "Arshi");
        s1.display();
        s2.display();

    }
}
