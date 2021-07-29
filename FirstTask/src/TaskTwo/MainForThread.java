package TaskTwo;

import java.util.Map;

public class MainForThread {
    public static void main(String[] args) throws InterruptedException {

//through lambda
        Thread threadOne = new Thread (() -> {
            System.out.println("First Thread name :"+Thread.currentThread().getName());
            SingleTonWithThread singleTon =  SingleTonWithThread.getObject();
        });

        threadOne.start();
        threadOne.join();
//through normal approch
       Thread threadTwo = new Thread (new Runnable(){
            public void run(){
                System.out.println("Second Thread name :"+Thread.currentThread().getName());
                SingleTonWithThread singleTon1 = SingleTonWithThread.getObject();
            }
        });
        threadTwo.start();
        threadTwo.join();

        System.out.println(SingleTonWithThread.threadStorage);
        String key[] = new String[2];
        SingleTonWithThread value[] = new SingleTonWithThread[2];
        int i = 0;
        for (Map.Entry mapElement : SingleTonWithThread.threadStorage.entrySet()) {
             key[i] = (String )mapElement.getKey();
            value[i] =(SingleTonWithThread) mapElement.getValue();
                i++;
        }
        System.out.println(key[0] + "  "+ value[0]);
        System.out.println(key[1]+ "  "+ value[1].toString());

        if(value[0] == value[1]){
            System.out.println("BOTH OBJECTS ARE SAME !!!! ");

        }

//
//        Map.Entry<String,SingleTonSubClass> entry = SingleTonSubClass.threadStorage.entrySet().iterator().next();
//        String key= entry.getKey();
//        SingleTonSubClass value=entry.getValue();
//        System.out.println(key);
//        System.out.println(value);


    }
}
