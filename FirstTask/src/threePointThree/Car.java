package threePointThree;

public class Car {

    CarAC ac = new CarAC(5000 , 5.34f);

    public void showAc(){
        System.out.println("AC Compressor MAX SPEED is :" + ac.AC_Compressor_MaxSpeed);
        System.out.println("AC Consenser capacity  is :" + ac.AC_Condenser_capacity);
    }
}
