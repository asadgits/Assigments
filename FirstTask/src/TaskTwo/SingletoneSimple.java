package TaskTwo;

import java.util.HashMap;
import java.util.Map;

public class SingletoneSimple {
    static Map<String, SingletoneSimple> threadStorage = new HashMap<String, SingletoneSimple>();


    private static SingletoneSimple ston;

    private SingletoneSimple() {
    }

    public static SingletoneSimple getObject() {
        if (ston == null) {
            ston = new SingletoneSimple();
            threadStorage.put(Thread.currentThread().getName(), ston);
        }
        threadStorage.put(Thread.currentThread().getName(), ston);
        return ston;

    }
}
