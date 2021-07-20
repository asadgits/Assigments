package TaskTwo;

public class SingleTon{

//    this approach is costly and eager loading   So we are moving to lazay loading appproach
    /*
    private static SingleTon st = new SingleTon();
    private SingleTon(){};

    public static SingleTon getObject(){
        return st;
    }

    */


// this approch is know as lazy loading approch because when we need the object it will
//    initialize the object when we call it



    //!!!!!!!!!!!!!!! There are major problem in this approch , this approch is not thread safe
//    because two or more thread can create multiple instance of this class
// because thay could access the method at one/same time and at before that time the objects were not been
//    instantiated


    /*
    private static SingleTon ston ;
    private SingleTon(){};


    public static SingleTon getObject(){

        if(ston == null){
            ston= new SingleTon();
        }
        return ston;

    }
    */


    //we can make it thread safe using synchronized keyword with the method of getObject()
//     in this approch there is an problem that which is ,with synchronized  keyword this slows
////    the program 100 times

/*
    private static SingleTon ston ;
    private SingleTon(){};


    public static synchronized SingleTon getObject(){

        if(ston == null){
            ston= new SingleTon();
        }
        return ston;

    }

    */




//    for solve previous problem we have an another solution
//    which is that , wo sleeps the execution of the multiple threads , for cetarin time
//    this technique is also slow !!!






// FINAL solution of this problem is that we use Double Check of condition using Synchronized block


//    Thread threadOne = new Thread (new Runnable(){
//
//        public void run(){
//            SingleTon ston = SingleTon.getObject();
//        }
//    });
//    Thread ThreadTwo = new Thread (new Runnable(){
//        public void run(){
//            SingleTon ston = SingleTon.getObject();
//        }
//    });




    private static SingleTon ston ;
    private SingleTon(){

        System.out.println("SINGLETON CLASS");

    };


    public static  SingleTon getObject(){

        if(ston == null){

            synchronized (SingleTon.class){

                if(ston == null)
                    ston= new SingleTon();

            }


        }
        return ston;

    }


// We have another way and best way to perform Single ton which is ENUM

    enum SnglTon{
        getInstance;

    }


}
