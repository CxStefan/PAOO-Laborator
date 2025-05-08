import java.util.List;

class ShapeDrawer {
    private List<DrawableShape> shapes;

    public ShapeDrawer(List<DrawableShape> shapes) {
        this.shapes = shapes;
    }

    public void drawAllShapes() {
        shapes.forEach(DrawableShape::draw);
    }
}