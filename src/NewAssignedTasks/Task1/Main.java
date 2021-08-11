package NewAssignedTasks.Task1;

import java.util.*;

import static java.lang.System.nanoTime;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> FindLastOfArrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        ///////////////LINKED LIST TIME CALCULATION
        LinkedList<Integer> FindLastOfLinkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        CollectionsExecutionTImeCalculate.testCollectionParameter(FindLastOfArrayList);
        CollectionsExecutionTImeCalculate.testCollectionParameter(FindLastOfLinkedList);


//            testCollectionParameter(FindLastOfArrayList);
//            testCollectionParameter(FindLastOfLinkedList);
    }

    public static void testCollectionParameter(Collection collectionOfValues ) {

        long starttimeOfArrayLIst = System.nanoTime();
        for (Object temp : collectionOfValues) {
            System.out.println(temp.toString());
        }
        long TotalTimeOfArrayListInNano = System.nanoTime() - starttimeOfArrayLIst;
        System.out.println("TOTAL TIME OF Collection IN MILLISECONDS : " + (TotalTimeOfArrayListInNano / 100000));


    }

}
