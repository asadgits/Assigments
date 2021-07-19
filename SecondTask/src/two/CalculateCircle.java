package two;

public class CalculateCircle implements ICalculateShape{
    private final double radius;

    @Override
    public double calculateArea() {
        return calculateCircleMethod(radius);
    }

    public CalculateCircle(double radius) {
        this.radius = radius;
    }

    private double calculateCircleMethod(double radius ){

        return (22*radius*radius)/7;
    }


}
