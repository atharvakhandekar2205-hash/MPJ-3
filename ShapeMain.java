import java.util.*;

class ShapeCalc {
    double value;

    ShapeCalc() {}

    ShapeCalc(double side) {
        value = side * side;
    }

    ShapeCalc(double r, int c) {
        value = Math.PI * r * r;
    }

    double area(int l, int b) {
        return l * b;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    double area(double side) {
        return side * side;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShapeCalc obj = new ShapeCalc();

        System.out.println("Rectangle Area: " + obj.area(5, 4));
        System.out.println("Triangle Area: " + obj.area(6.0, 3.0));
        System.out.println("Square Area: " + obj.area(5.0));

        ShapeCalc c1 = new ShapeCalc(4);
        ShapeCalc c2 = new ShapeCalc(3.0, 1);

        System.out.println("Square (Constructor): " + c1.value);
        System.out.println("Circle (Constructor): " + c2.value);
    }
}
