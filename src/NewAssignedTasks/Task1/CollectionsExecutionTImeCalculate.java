package NewAssignedTasks.Task1;

import java.util.Collection;

import static java.lang.System.*;

public class CollectionsExecutionTImeCalculate {
    public static void testCollectionParameter(Collection collectionOfValues){

        long starttime = nanoTime();
        for (Object temp : collectionOfValues) out.println(" ==>" + temp.toString());
        long TotalTimeInNano = nanoTime() - starttime;
        out.println("TOTAL TIME OF Collection IN MILLISECONDS : " + (TotalTimeInNano / 100000));

    }

}
