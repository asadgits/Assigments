package TaskTwo;

import java.util.concurrent.*;

public class MainForExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("===========================================================================================");
        System.out.println("                                     SINGLETON CLASS");
        System.out.println("===========================================================================================");

        ExecutorService executor = Executors.newFixedThreadPool(7);
        Future<SingleTonWithExecutor> futureCall = executor.submit(new Callable<SingleTonWithExecutor>() {
            @Override
            public SingleTonWithExecutor call() throws Exception {
                return SingleTonWithExecutor.getObject();
            }
        });
        SingleTonWithExecutor result1= futureCall.get();



        System.out.println("THIS IS HASHCODE OF : First INSTANCE : " + result1.hashCode());
        System.out.println("THIS IS REFERENCE OF : First INSTANCE : " + result1.getClass());
        System.out.println("THIS IS REFERENCE OF : First INSTANCE : " + result1);

        Future<SingleTonWithExecutor> futureCall1 = executor.submit(new Callable<SingleTonWithExecutor>() {
            @Override
            public SingleTonWithExecutor call() throws Exception {
                return SingleTonWithExecutor.getObject();
            }
        });

        SingleTonWithExecutor result2 = futureCall1.get(); // Here the thread will be blocked
        // until the result came back.

        System.out.println("THIS IS HASHCODE OF : SECOND INSTANCE : " + result2.hashCode());
        System.out.println("THIS IS REFERENCE OF : SECOND INSTANCE : " + result2.getClass());
        System.out.println("THIS IS REFERENCE OF : SECOND INSTANCE : " + result2);

        if(result1 == result2){
            System.out.println("True   SAME OBJECTS !!!");
            System.out.println("because Thay had same hashCode !!  \n Object1 : "+ result1 + "\n Object2 : " + result2);
        }


        executor.shutdown();
        System.out.println("===========================================================================================");
        System.out.println("===========================================================================================");


    }
}
