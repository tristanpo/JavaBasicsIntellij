package Class21;

public class ShapeClass {
    double radius;

    public ShapeClass(double radius) {
        this.radius = radius;
    }

    public class Circle extends ShapeClass {
        double area;

        public Circle(double radius) {
            super(radius);

        }

        void Area() {
            area = Math.PI * radius * radius;
        }
    }

    /*class Tester1234 {
        public static void main(String[] args) {
            Circle circle = new Circle(2.4);
            circle.Area();
        }*/
    }
//}





