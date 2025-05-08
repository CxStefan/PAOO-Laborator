public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(5,6);

        CalculateArea.calculateArea(circle);
        CalculateArea.calculateArea(square);
        CalculateArea.calculateArea(rectangle);
    }
}
