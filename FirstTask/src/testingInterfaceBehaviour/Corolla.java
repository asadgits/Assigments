package testingInterfaceBehaviour;


public class Corolla implements CarType , Engine {


    @Override
    public void work() {
        System.out.println("WORKING ");
    }

}
