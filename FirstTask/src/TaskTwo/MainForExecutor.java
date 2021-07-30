package TaskTwo;

import java.util.concurrent.*;

public class MainForExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        2. Write a program in java that implements Singleton design pattern.
//           The program should only make One object and upon creating another object, it should return the same object.
//           Also confirm this behaviour by prinitng the object.
//           Another way to determine same object is the ""=="" operator, it should return `true` if you have same object in both references.


        ExecutorService executor = Executors.newFixedThreadPool(7);
        Future<SingleTonWithExecutor> futureCall = executor.submit(new Callable<SingleTonWithExecutor>() {
            @Override
            public SingleTonWithExecutor call() throws Exception {
                return SingleTonWithExecutor.getObject();
            }
        });
        SingleTonWithExecutor result1= futureCall.get();

        Future<SingleTonWithExecutor> futureCall1 = executor.submit(new Callable<SingleTonWithExecutor>() {
            @Override
            public SingleTonWithExecutor call() throws Exception {
                return SingleTonWithExecutor.getObject();
            }
        });

        SingleTonWithExecutor result2 = futureCall1.get();


        if(result1 == result2){
            System.out.println("True   SAME OBJECTS !!!");
            System.out.println("because Thay had same hashCode !!  \n Object1 : "+ result1 + "\n Object2 : " + result2);
        }
        executor.shutdown();
    }
}
