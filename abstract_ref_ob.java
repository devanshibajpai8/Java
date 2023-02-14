import java.util.Scanner;

abstract class Shape {
    int length, breadth, radius;
    Scanner s = new Scanner(System.in);

    abstract void Area();
}

class Circle extends Shape {
    void Area() {
        System.out.print("Enter Radius:");
        radius = s.nextInt();
        System.out.println("The area of Circle is: " + 3.14f * radius * radius);
    }
}

class Rectangle extends Shape {
    void Area() {
        System.out.print("Enter length and breadth:");
        length = s.nextInt();
        breadth = s.nextInt();
        System.out.println("The area of reactangle is: " + length * breadth);
    }
}

public class abstract_ref_ob {
    public static void main(String[] args) {
        Shape s;
        Circle cir = new Circle();
        s = cir;
        s.Area();
        Rectangle rec = new Rectangle();
        s = rec;
        s.Area();
    }
}