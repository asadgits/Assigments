package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondMain {
    public static void main(String[] args) {

        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> FindLastOfArrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        long starttimeOfArrayLIst = System.nanoTime();
        for (int temp:FindLastOfArrayList) {
            if (FindLastOfArrayList.get(FindLastOfArrayList.size()-1) == temp) {
                System.out.println("Last Element Of ArrayList : " + temp);
                break;
            }
        }
        long TotalTimeOfArrayListInNano = System.nanoTime() - starttimeOfArrayLIst;
        System.out.println("TOTAL TIME OF ARRAY LIST IN MILLISECONDS : " + (TotalTimeOfArrayListInNano/100000));


        ///////////////LINKED LIST TIME CALCULATION
        LinkedList<Integer> FindLastOfLinkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        long starttimeOfLinkedLIst = System.nanoTime();

        for (Integer temp:FindLastOfLinkedList) {
            if (FindLastOfLinkedList.getLast() == temp)
                System.out.println("Last Element Of LinkedList : "+temp);
        }
        long TotalTimeOfLinkedListListInNano = System.nanoTime() - starttimeOfArrayLIst;
        System.out.println("TOTAL TIME OF ARRAY LIST IN MILLISECONDS : " + (TotalTimeOfLinkedListListInNano/100000));

    }
}
//            if (FindLastOfLinkedList.get(FindLastOfLinkedList.size()-1) == temp)
//                System.out.println("Last Element Of LinkedList : "+temp);
