package calculator;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator kalulator = new ShapeCalculator();
        System.out.println(kalulator.lineLength(new Line2D(4)));
        System.out.println(kalulator.circleArea(new Circle(2)));
        System.out.println(kalulator.rectArea(new Rectangle(6,8)));
    }
}
