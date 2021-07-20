package threePointThree;

public class Car {

    CarAC acSpecification = new CarAC(5000 , 5.34f);

    public void showAc(){
        System.out.println("AC Compressor MAX SPEED is :" + acSpecification.AC_Compressor_MaxSpeed);
        System.out.println("AC Consenser capacity  is :" + acSpecification.AC_Condenser_capacity);
    }
}
