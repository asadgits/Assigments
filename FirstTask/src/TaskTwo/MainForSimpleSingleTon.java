package TaskTwo;

import java.util.Map;

public class MainForSimpleSingleTon {
    public static void main(String[] args) throws InterruptedException {

        //through lambda
        Thread threadOne = new Thread (() -> {
            SingletoneSimple.getObject();
        } , "Thread1");



        //through normal approch
        Thread threadTwo = new Thread (new Runnable(){
            public void run(){
                SingletoneSimple.getObject();
            }
        } );
        threadTwo.setName("Thread2");



        //through method reference
        Thread threadThree = new Thread (SingletoneSimple::getObject, "Thread3");
        threadThree.start();
        threadTwo.start();
        threadOne.start();
        Thread.sleep(2000);

        System.out.println("FULL HASHMAP PRINT : "+SingletoneSimple.threadStorage);
//
//        System.out.println(SingletoneSimple.threadStorage.get("Thread1"));
//        System.out.println(SingletoneSimple.threadStorage.get("Thread2"));
//        System.out.println(SingletoneSimple.threadStorage.get("Thread3"));

        printHashmap(3);



    }

    public static void printHashmap(int numOfThread){
        String key[] = new String[numOfThread];
        SingletoneSimple value[] = new SingletoneSimple[numOfThread];
        int i = 0;
        for (Map.Entry mapElement : SingletoneSimple.threadStorage.entrySet()) {
            key[i] = (String )mapElement.getKey();
            value[i] =(SingletoneSimple) mapElement.getValue();
            System.out.println(key[i]+" =  "+value[i]);
            i++;
        }

        if(value[0] == value[1]){
            System.out.println("BOTH OBJECTS ARE SAME !!!! ");

        }
    }

}

