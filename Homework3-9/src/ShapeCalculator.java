import java.util.List;

public class ShapeCalculator {
    
    public static void printAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(3),
                new Square(4),
                new Rectangle(5, 2)
        );
        printAreas(shapes);
    }
}