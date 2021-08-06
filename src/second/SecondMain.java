package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondMain {
    /**
     * @param args 2. Write a java program that searches last item in an ArrayList and Linked List and prints the search
     *             time in milliseconds to check which collection is faster in traversing and searching a perticular item.
     *             <p>
     *             NOTE: The data stored in both the collections is same and the item serched is also fixed according to position
     *             in the collection.
     *             e.g [23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100] and you are finding ""100""(last item) in
     *             both the collections.
     */
    public static void main(String[] args) {

        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> FindLastOfArrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        long starttimeOfArrayLIst = System.nanoTime();
        for (int temp : FindLastOfArrayList) {
            if (FindLastOfArrayList.get(FindLastOfArrayList.size() - 1) == temp) {
                System.out.println("Last Element Of ArrayList : " + temp);
                break;
            }
        }
        long TotalTimeOfArrayListInNano = System.nanoTime() - starttimeOfArrayLIst;
        System.out.println("TOTAL TIME OF ARRAY LIST IN MILLISECONDS : " + (TotalTimeOfArrayListInNano / 100000));


        ///////////////LINKED LIST TIME CALCULATION
        LinkedList<Integer> FindLastOfLinkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        long starttimeOfLinkedLIst = System.nanoTime();

        for (Integer temp : FindLastOfLinkedList) {
            if (FindLastOfLinkedList.getLast() == temp)
                System.out.println("Last Element Of LinkedList : " + temp);
        }
        long TotalTimeOfLinkedListListInNano = System.nanoTime() - starttimeOfArrayLIst;
        System.out.println("TOTAL TIME OF ARRAY LIST IN MILLISECONDS : " + (TotalTimeOfLinkedListListInNano / 100000));

    }
}