package NewAssignedTasks.Task1;

import java.util.*;

import static java.lang.System.nanoTime;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> ArrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        ///////////////LINKED LIST TIME CALCULATION
        LinkedList<Integer> LinkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        out.println("EXECUTION TIME OF LINKEDLIST: " + TimeCalculate.testCollectionParameter(LinkedList));
        out.println("EXECUTION TIME OF ARRAYLIST: " + TimeCalculate.testCollectionParameter(ArrayList));


    }
}
