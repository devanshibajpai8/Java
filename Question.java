
public class Question {
    public static void main(String arg[]) {
        Rectangle r = new Rectangle(10, 4);
        Square s = new Square(7);
        Circle c = new Circle(3);
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.print("Circle Area : ");
        System.out.format("%.3f", +c.getArea()); // restricting decimal placse to 2 decimal place
        System.out.println();

        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea())) {
            System.out.println("Rectangle has the largest area.");
        } else if (s.getArea() > c.getArea()) {
            System.out.print("Square has the largest area.");
        }
    }
}

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

class Circle {
    int r;

    Circle(int r) {
        this.r = r;
    }

    double getArea() {
        return 3.14 * r * r;
    }

}