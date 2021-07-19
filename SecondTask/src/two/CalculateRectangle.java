package two;

public class CalculateRectangle implements ICalculateShape{

    private final double length;
    private final double breath;

    public double calculateArea() {
        return calculateTriAngleMethod(length , breath);
    }

    public CalculateRectangle(double length ,double breath) {
        this.length = length;
        this.breath = breath;
    }

    private double calculateTriAngleMethod(double length ,double breath){

        return  (length*breath);
    }
}
