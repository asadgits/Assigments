package TaskTwo;

import java.util.HashMap;
import java.util.Map;

public class SingleTonWithThread {
    static Map<String, SingleTonWithThread> threadStorage = new HashMap<String, SingleTonWithThread>();

    private static SingleTonWithThread ston;
    private SingleTonWithThread(){ };

    public static void getObject() {
        if (ston == null) {
            synchronized (SingleTonWithThread.class) {

                if (ston == null) {
                    ston = new SingleTonWithThread();
                    threadStorage.put(Thread.currentThread().getName(), ston);
                }
            }
        } else {
            threadStorage.put(Thread.currentThread().getName(), ston);
        }

    }//end getObject method
}//end main class
