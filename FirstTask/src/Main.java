import Five.Corolla;
import Four.Yamaha;
import TaskOne.Student;
import TaskThree.Car;
import threePointFour.Company;
import threePointFour.Emplyee;
import threePointTwo.BigSchoolingSystem;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class  Main{

    public static void main(String abc[]) throws ExecutionException, InterruptedException {


//        "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)

        Student InsertStudent = new Student();
        InsertStudent.setName("KHAID");
        InsertStudent.setFatherName("KHAN");
        InsertStudent.setRollNo("A1234");



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
