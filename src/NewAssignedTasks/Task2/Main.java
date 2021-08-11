package NewAssignedTasks.Task2;

import NewAssignedTasks.Task1.TimeCalculate;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Execution Time of String object: " + passFunction(i-> System.out.println("String Value: "+i) , "KHALID"));
        System.out.println("Execution Time of Integer object: " + passFunction(i-> System.out.println("Integer Value: "+i) , 55));
        System.out.println("Execution Time of FLOAT object: " + passFunction(i-> System.out.println("StriFloatng Value: "+i) , 70.4f));
        System.out.println("Execution Time of Boolean object: " + passFunction(i-> System.out.println("Boolean Value: "+i) , true));

        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> ArrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        System.out.println("Execution Time of ARRAYLIST object: " + passFunction(i->i.forEach(System.out::println) , ArrayList));

        ///////////////LINKED LIST TIME CALCULATION
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        System.out.println("Execution Time of LINKEDLIST object: " + passFunction(i->i.forEach(System.out::println) , linkedList));

    }//main bracket

//
//    long starttime = System.nanoTime();
//        TimeCalculate.testCollectionParameter(pass.getTime(i));
//    long totalTime = System.nanoTime() - starttime;
//        System.out.println((totalTime / 100000));


//    public static <T> void passFunction(PassFunction<T> pass, T i){
//        pass.getTime(i);
//    }
//
//    public static <T> void testGeneric(T t){
//
//        System.out.println("THIS IS Generic: "+t);
//
//    }




    public static <T> Long passFunction(Consumer<T> consumer,T i){

        long starttime = System.nanoTime();
        consumer.accept(i);
        long totalTime = System.nanoTime() - starttime;
        return (totalTime / 100000);
    }

    public static <T> Long passFunction(Consumer<Collection<T>> consumer, Collection<T> i){

        long starttime = System.nanoTime();
        consumer.accept(i);
        long totalTime = System.nanoTime() - starttime;
        return (totalTime / 100000);
    }

    public static <K, V> Long passFunction(Consumer<Map<K, V>> consumer, Map<K, V> i){

        long starttime = System.nanoTime();
        consumer.accept(i);
        long totalTime = System.nanoTime() - starttime;
        return (totalTime / 100000);
    }



//     class GetConsumer<T> implements Consumer<T>{
//
//         @Override
//         public void accept(T t) {
//
//             long starttimeOfArrayLIst = System.nanoTime();
//             for (int i =0; i<10; i++) System.out.println(t);
//
//             long TotalTimeOfArrayListInNano = System.nanoTime() - starttimeOfArrayLIst;
//             System.out.println( (TotalTimeOfArrayListInNano / 100000));
//         }
//     }


}