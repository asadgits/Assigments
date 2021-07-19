package two;

public class CalculateTriangle implements ICalculateShape{

    private final double breath;
    private final double height;

    @Override
    public double calculateArea() {
        return calculateTriAngleMethod(breath , height);
    }

    public CalculateTriangle(double breath ,double height) {
        this.breath = breath;
        this.height = height;
    }

    private double calculateTriAngleMethod(double breath ,double height){

        return  (breath*height)/2;
    }
}
