import Five.Corolla;
import Four.Yamaha;
import TaskOne.Student;
import TaskThree.Car;
import TaskTwo.SingleTon;
import threePointFour.Company;
import threePointFour.Emplyee;
import threePointTwo.BigSchoolingSystem;

import java.util.ArrayList;
import java.util.List;

public class  Main{

    public static void main(String abc[]){


//        "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)

        Student InsertStudent = new Student();
        InsertStudent.setName("KHAID");
        InsertStudent.setFatherName("KHAN");
        InsertStudent.setRollNo("A1234");


//        2. Write a program in java that implements Singleton design pattern.
//           The program should only make One object and upon creating another object, it should return the same object.
//           Also confirm this behaviour by prinitng the object.
//           Another way to determine same object is the ""=="" operator, it should return `true` if you have same object in both references.

        Thread threadOne = new Thread (new Runnable(){
            public void run(){
              SingleTon.getObject();
            }
        });

        Thread threadTwo = new Thread (new Runnable(){
            public void run(){
            SingleTon.getObject();
            }
        });

        threadOne.start();
      //  try{ Thread.sleep(10);}catch(Exception e){}
        threadTwo.start();




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




    }

}
