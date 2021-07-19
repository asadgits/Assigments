package one;

public class CalculateShape {

    public double calculateArea(double radius)
    {
        return (22*radius*radius)/7;
    }

    public double  calculateArea(double length ,double breath )
    {
        return (length*breath);
    }

    public Long calculateArea(long  breath ,long height )
    {
        return (breath*height)/2;
    }


}
