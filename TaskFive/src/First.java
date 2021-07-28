public class First extends Thread{

    public static void countDown() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
                // e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //Method reference
        Thread t1 = new Thread(First::countDown);
        t1.setName("Thread1");
        t1.start();
        t1.join();

        //lambda type
        Thread t2 = new Thread(()->countDown());
        t2.setName("Thread2");
        t2.start();
        t2.join();

        for (int i = 0; i <= 5; i++)
            System.out.println(Thread.currentThread().getName());



    }//main bracket
}//Main Class
