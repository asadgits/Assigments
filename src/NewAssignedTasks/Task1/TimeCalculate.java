package NewAssignedTasks.Task1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class TimeCalculate {
    public static <T> Long testCollectionParameter(T values){
        if(values instanceof Collection) {
           return calculateTime((Collection) values);
        }
        else {
            return 0L;
        }


    }

    private static long calculateTime(Collection c) {
        long starttime = nanoTime();
        for (Object temp : c) out.println(" ==>" + temp.toString());
        long TotalTimeInNano = nanoTime() - starttime;
        return (TotalTimeInNano / 100000);
    }
}
