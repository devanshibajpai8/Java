import java.util.Scanner;

class circle {
    float radius;

    void setDiameter(float rad) {
        radius = rad;
        float diameter = 2 * radius;
        System.out.println("Diameter is:" + diameter);
    }

    void findArea() {
        float area = (float) 3.14 * radius * radius;
        System.out.println("Area of circle:" + area);
    }

    void findperimeter() {
        float peri = (float) 3.14 * radius * 2;
        System.out.println("Perimeter of circle: " + peri);
    }
}

class Circle_program {
    public static void main(String[] args) {
        System.out.print("Enter radius of the circle:");
        Scanner n = new Scanner(System.in);
        int rad;
        rad = n.nextInt();
        circle obj = new circle();
        obj.setDiameter(rad);
        obj.findArea();
        obj.findperimeter();
        n.close();
    }
}
