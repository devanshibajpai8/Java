import java.util.Scanner;

abstract class Shape {
    int height, base, radius, side;
    Scanner s = new Scanner(System.in);

    abstract void calculateArea();
}

class Circle extends Shape {
    void calculateArea() {
        System.out.print("Enter Radius:");
        radius = s.nextInt();
        System.out.println("The area of Circle is: " + 3.14f * radius * radius);
    }
}

class Triangle extends Shape {
    void calculateArea() {
        System.out.print("Enter height and base:");
        height = s.nextInt();
        base = s.nextInt();
        System.out.println("The area of Triangle is: " + 0.5 * base * height);
    }
}

class Square extends Shape {
    void calculateArea() {
        System.out.print("Enter side:");
        side = s.nextInt();
        System.out.println("The area of square is: " + side * side);
    }

}

public class cir_rec_abstract {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.calculateArea();
        Triangle tri = new Triangle();
        tri.calculateArea();
        Square sq = new Square();
        sq.calculateArea();
    }
}
