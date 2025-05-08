import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DrawableShape> ds = List.of(new Circle(),new Square(),new Triangle());

        ShapeDrawer drawer = new ShapeDrawer(ds);

        drawer.drawAllShapes();
    }
}
