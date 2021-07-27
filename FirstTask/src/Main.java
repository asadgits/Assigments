import Five.Corolla;
import Four.Yamaha;
import TaskOne.Student;
import TaskThree.Car;
import TaskTwo.SingleTon;
import jdk.swing.interop.SwingInterOpUtils;
import threePointFour.Company;
import threePointFour.Emplyee;
import threePointTwo.BigSchoolingSystem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class  Main{

    public static void main(String abc[]) throws ExecutionException, InterruptedException {


//        "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)

        Student InsertStudent = new Student();
        InsertStudent.setName("KHAID");
        InsertStudent.setFatherName("KHAN");
        InsertStudent.setRollNo("A1234");


//        2. Write a program in java that implements Singleton design pattern.
//           The program should only make One object and upon creating another object, it should return the same object.
//           Also confirm this behaviour by prinitng the object.
//           Another way to determine same object is the ""=="" operator, it should return `true` if you have same object in both references.

//
//        Map<Integer, SingleTon> singletonObjects = new HashMap<>();
//            ExecutorService executor = Executors.newFixedThreadPool(7);
//            for(int index = 0; index<20; index++) {
//                Future<SingleTon> futureCall = executor.submit(new Callable<SingleTon>() {
//                    @Override
//                    public SingleTon call() throws Exception {
//                        return SingleTon.getObject();
//                    }
//                });
//                SingleTon result1 = futureCall.get(); // Here the thread will be blocked
//                singletonObjects.put(index, result1);
//            }
//            singletonObjects.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" -> "+e.getValue()));
//            // until the result came back.

        /*System.out.println("THIS IS HASHCODE OF : FIRST INSTANCE : "+result1.hashCode());
        System.out.println("THIS IS REFERENCE OF : FIRST INSTANCE : "+result1.getClass());
        System.out.println("THIS IS REFERENCE OF : FIRST INSTANCE : "+result1);*/


        System.out.println("===========================================================================================");
        System.out.println("                                     SINGLETON CLASS");
        System.out.println("===========================================================================================");

        ExecutorService executor = Executors.newFixedThreadPool(7);
        Future<SingleTon> futureCall = executor.submit(new Callable<SingleTon>() {
            @Override
            public SingleTon call() throws Exception {
                return SingleTon.getObject();
            }
        });
        SingleTon result1= futureCall.get();



        System.out.println("THIS IS HASHCODE OF : First INSTANCE : " + result1.hashCode());
        System.out.println("THIS IS REFERENCE OF : First INSTANCE : " + result1.getClass());
        System.out.println("THIS IS REFERENCE OF : First INSTANCE : " + result1);

        Future<SingleTon> futureCall1 = executor.submit(new Callable<SingleTon>() {
            @Override
            public SingleTon call() throws Exception {
                return SingleTon.getObject();
            }
        });

        SingleTon result2 = futureCall1.get(); // Here the thread will be blocked
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



//
//
//        SingleTon singleTon1;
//
////through lambda
//        new Thread (() -> {
//            SingleTon singleTon =  SingleTon.getObject();
//        }).start();
//
////through normal approch
//       Thread threadTwo = new Thread (new Runnable(){
//            public void run(){
//                SingleTon singleTon1 = SingleTon.getObject();
//            }
//        });
//
//
//      //  try{ Thread.sleep(10);}catch(Exception e){}
//        threadTwo.start();



        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

//        ExecutorService es = new Exe
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////



//        SingleTon ston1 =  SingleTon.getObject();
//        SingleTon ston2 =  SingleTon.getObject();
//
//        if(ston1 == ston2){
//            System.out.println("True");
//            System.out.println("SAME OBJECTS !!!");
//            System.out.println("because Thay had same hashCode !!  \n Object1 : "+ ston1 + "\n Object2 : " + ston2);
//        }




//        3. Create an example of Inheritence.


//        3.1. Inherit a class.

        Car car = new Car();
        car.run();
        car.drift();

//        3.2. Compose a class.

        BigSchoolingSystem bigSchoolingSystem = new BigSchoolingSystem();
        bigSchoolingSystem.RegisterStudent.setName("KHALID");
        bigSchoolingSystem.RegisterStudent.setFatherName("KHAN");
        bigSchoolingSystem.RegisterStudent.setRollNo("A1234");


        bigSchoolingSystem.printSchool();
        bigSchoolingSystem.printStudent();

//        3.2.1. Compose class with Aggregation.

        //So Car Can exists without AC
        threePointThree.Car carWithAC = new threePointThree.Car();
        carWithAC.showAc();


//        3.2.2. Compose class with Composition.

        //but Company cannot exsit without Employees
        Emplyee employeeNoOne = new Emplyee("A123" , "KHALID" , 03322345154);

        Emplyee employeeNoTwo = new Emplyee("A124" , "Hammad" , 03322345154);

        List<Emplyee> employeeList = new ArrayList<Emplyee>();
        employeeList.add(employeeNoOne);
        employeeList.add(employeeNoTwo);


        Company companyName = new Company(employeeList);







//        4. Abstract class and interface. (difference) interface mulitple inheritance
//        (if both interfaces method same then what is the behaviour, abstract class and interface)



        //Example of Abstract class that  can extends only one abstract Or normal class
        Yamaha yamaha=new Yamaha();
        yamaha.show();



        //Example of interface that  can extends Multiple Interfaces
        Corolla corolla=new Corolla();
        corolla.speed();



//        The question is: Can a java class implement Two interfaces with same methods having
//        the same signature but different return types??
//
//        Answer is: No, its an error
//        but if both methods has void return type then it does not shows an error instead that implementation
//        was for both of them

        testingInterfaceBehaviour.Corolla corollaCar = new testingInterfaceBehaviour.Corolla();
        corollaCar.work();

//        The question is: Can a java class implement One interfaces and One Abstract Class
//        with same methods having the same signature but different return types??

        testInterfaceAndAbstractClass.Corolla corollaClass = new testInterfaceAndAbstractClass.Corolla();
        corollaClass.work();

        //So the conclusion is that if in both interface and Abstract has a method with same name so there are
        // two possibilities , number one is that both has different return type So definatily i will show error
        //of clash between them

        //if both are retrun's void , in this situtation 2 possible outputs!!!
        // 1) is that if we declared the body of the method in Abstract class and also in
        // inherited class it will consider the implementation of abstract class method and ignores
        // the implementation which is declared in inherited class

        // 2) if we didn't declare the body of that method in abstract class instead we declare the body in
        // inherited class So that implementation will considered for both interface and for abstract class

        // if we didn't declare any implementation in any of them in inherited class or in absract class
        //it will give error in abstract class for implement the method of interface


    }




}
