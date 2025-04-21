class ShapeFactory {
    public static Shape createShape(float... params) {
        if (params.length == 1) {
            return new Circle(params[0]);
        } else if (params.length == 2) {
            return new Rectangle(params[0], params[1]);
        } else {
            throw new IllegalArgumentException("Invalid number of parameters");
        }
    }
}