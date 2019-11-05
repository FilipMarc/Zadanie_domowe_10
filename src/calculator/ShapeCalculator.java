package calculator;

public class ShapeCalculator extends LineCalc implements Calc2D,Calc3D {
    @Override
    public double rectArea(Rectangle rect) {
        return rect.getA() * rect.getB();
    }

    @Override
    public double circleArea(Circle circle) {
        return Math.pow(circle.getR(), 2) * Math.PI;
    }

    @Override
    public double lineLength(Line2D line) {
        return super.lineLength(line);
    }

    @Override
    public double ballVolume(Ball ball) {
        return Math.pow(ball.getR(), 2) * Math.PI;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getA()*3;
    }
}
