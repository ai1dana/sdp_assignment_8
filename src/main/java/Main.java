import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Shape> shapes = List.of(new Circle(2), new Rectangle(4,6), new Triangle(3,4));
        Visitor areaVisitor = new AreaCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);

        }
    }
}
