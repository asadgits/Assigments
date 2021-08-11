package NewAssignedTasks.Task2;

import first.Student;
import org.w3c.dom.ls.LSOutput;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        ///////////////ARRAY LIST TIME CALCULATION
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

//        calculateFunctionExecutionTime(sampleFunction() );

        ////consumer gets one input and no returns
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("pakistan");
        Consumer<String> consumer1 = (String s) -> System.out.println(s);
        consumer1.accept("ZINDABAD");
        Consumer<String> consumer11 = (String s) -> System.out.println(s);
        consumer11.accept("pakistan");


        Consumer<Integer> consumer2 = (Integer s) -> System.out.println(s);
        consumer2.accept(10);

        Consumer<Float> consumer3 = (Float s) -> System.out.println(s);
        consumer3.accept(20.5f);

        consumer.andThen(consumer1).andThen(consumer11);

        ///suppiler gets no arguments and returns any result
        Supplier<String> supplier = () -> "KHALID";
        Supplier<Integer> supplier1 = () -> 11;
        Supplier<Float> supplier2 = () -> 20.5f;

        System.out.println("\n\n" + supplier.get());
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

        String value = "khalid";

        ///Predicate gets one argument and returns Boolean
        Predicate<String> predicate = name -> name.equals("khalid");
        System.out.println(predicate.test(value));




    }

    }


//    public static void sampleFunction(ArrayList collectionOfValues){
//        for (Object temp : collectionOfValues) out.println(" ==>" + temp.toString());
//    }
//
//    public static Long calculateFunctionExecutionTime(Consumer anyFunction, ArrayList arrayList){
//
//        long starttimeOfArrayLIst = System.nanoTime();
//        anyFunction.accept(arrayList);
//        long TotalTimeOfArrayListInNano = System.nanoTime() - starttimeOfArrayLIst;
//        return (TotalTimeOfArrayListInNano / 100000);
//
//    }


