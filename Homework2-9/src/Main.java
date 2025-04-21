public class Main {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.createShape(3.5f);
        Shape s2 = ShapeFactory.createShape(4.0f, 5.0f);

        System.out.println("Aria cercului: " + s1.getArea());
        System.out.println("Aria dreptunghiului: " + s2.getArea());
    }
}