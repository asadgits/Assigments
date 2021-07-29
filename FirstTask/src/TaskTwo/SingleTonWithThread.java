package TaskTwo;

import java.util.HashMap;
import java.util.Map;

public class SingleTonWithThread {

    static Map<String, SingleTonWithThread> threadStorage = new HashMap<String, SingleTonWithThread>();

    private static SingleTonWithThread ston;
    private SingleTonWithThread(){ };

    //    private static int count;
    public static SingleTonWithThread getObject(){
        if(ston == null){
            synchronized (SingleTonWithThread.class){
                if(ston == null)
                    ston= new SingleTonWithThread();
                threadStorage.put(Thread.currentThread().getName() , ston);
//                System.out.println("First Time HashMAP printing : "+ SingleTonWithThread.threadStorage);
//                System.out.println(Thread.currentThread().getName() +"    "+ ston.getClass());

                }

            }

        threadStorage.put(Thread.currentThread().getName() , ston);
//        System.out.println("SECOND Time HashMAP printing : "+ SingleTonWithThread.threadStorage);
//        System.out.println(Thread.currentThread().getName() +"    "+ ston.getClass());
            return ston;
        }


}
