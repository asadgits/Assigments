package TaskTwo;

public class SingleTon {

    private static SingleTon st = new SingleTon();
    private SingleTon(){};

    public static SingleTon getObject(){
        return st;
    }
}
