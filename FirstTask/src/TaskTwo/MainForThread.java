package TaskTwo;

import java.util.Map;

public class MainForThread {
    public static void main(String[] args) throws InterruptedException {

        //through lambda
        Thread threadOne = new Thread (() -> {
            SingleTonWithThread.getObject();
        } , "Thread1");



        //through normal approch
       Thread threadTwo = new Thread (new Runnable(){
            public void run(){
                SingleTonWithThread.getObject();
            }
        } );
       threadTwo.setName("Thread2");



        //through method reference
        Thread threadThree = new Thread (SingleTonWithThread::getObject, "Thread3");
        threadThree.start();
        threadTwo.start();
        threadOne.start();
         Thread.sleep(2000);

        System.out.println("FULL HASHMAP PRINT : "+SingleTonWithThread.threadStorage);

        printHashmap(3);



    }

    public static void printHashmap(int numOfThread){
        String key[] = new String[numOfThread];
        SingleTonWithThread value[] = new SingleTonWithThread[numOfThread];
        int i = 0;
        for (Map.Entry mapElement : SingleTonWithThread.threadStorage.entrySet()) {
            key[i] = (String )mapElement.getKey();
            value[i] =(SingleTonWithThread) mapElement.getValue();
            System.out.println(key[i]+" =  "+value[i]);
            i++;
        }

        if(value[0] == value[1]){
            System.out.println("BOTH OBJECTS ARE SAME !!!! ");

        }
    }

}
