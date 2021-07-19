import one.CalculateShape;
import three.Employee;
import three.IPerson;
import two.CalculateCircle;
import two.CalculateRectangle;
import two.CalculateTriangle;
import two.ICalculateShape;

public class MainClass {
    public static void main(String abd[]){

//        "1. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Compile-Time polymorphism.
//        HINT: You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()""
//        Limitations: Inheritance is not allowed.

        CalculateShape calculateShape =  new CalculateShape() ;

        System.out.println("Area Of Circle : " + calculateShape.calculateArea(20.0));
        System.out.println("Area Of Triangle : " + calculateShape.calculateArea(10 , 20));
        System.out.println("Area Of Rectangle : " + calculateShape.calculateArea(20.0 , 30.0));


//        2. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Run-Time polymorphism.
//        HINT: 1. You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()"".
//        2. Inheritance is allowed.

        ICalculateShape CalculateShapeRunTime = new CalculateCircle(20.0);
        System.out.println("\n\n\n RADIUS is "+CalculateShapeRunTime.calculateArea());

        ICalculateShape CalculateShapeRunTime1 = new CalculateTriangle(10.0 , 20.0);
        System.out.println("\n Triangle is "+CalculateShapeRunTime1.calculateArea());

        ICalculateShape CalculateShapeRunTime2 =  new CalculateRectangle(20.0 , 30.0);
        System.out.println("\n Rectangle is "+CalculateShapeRunTime2.calculateArea());

//        3. Write a program in java to implement abstraction, the program should have two classes ""Person"" and ""Employee""
//        but it should not expose the details of ""Person"" class by using Abstraction."

        System.out.println("\n\n");
        IPerson person = new Employee("A123" , "KHALID" , "KHAN" , "COMPUTER SCIENCE");
        person.Details();










    }
}
