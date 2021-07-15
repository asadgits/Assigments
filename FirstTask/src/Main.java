import Four.ClassD;
import TaskOne.Student;
import TaskThree.ClassB;
import TaskTwo.SingleTon;
import threePointFour.Company;
import threePointFour.Emplyee;
import threePointThree.Car;
import threePointTwo.Composeexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String abc[]){


//        "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)

        Student s1 = new Student();
        s1.Name = "KHALID";
        s1.fName = "KHAN";
        s1.RollNo = "A712";

        Student s2 = new Student("HAMMAD" , "KHAN" , "B123");

//        2. Write a program in java that implements Singleton design pattern.
//           The program should only make One object and upon creating another object, it should return the same object.
//           Also confirm this behaviour by prinitng the object.
//           Another way to determine same object is the ""=="" operator, it should return `true` if you have same object in both references.


        SingleTon ston1 =  SingleTon.getObject();
        SingleTon ston2 =  SingleTon.getObject();

        if(ston1 == ston2){
            System.out.println("True");
            System.out.println("SAME OBJECTS !!!");
            System.out.println("because Thay had same hashCode !!  \n Object1 : "+ ston1 + "\n Object2 : " + ston2);
        }




//        3. Create an example of Inheritence.


//        3.1. Inherit a class.

        ClassB b = new ClassB();
        b.Hello();
        b.show();

//        3.2. Compose a class.

        Composeexample cc = new Composeexample();
        cc.printSchool();
        cc.printStudent();

//        3.2.1. Compose class with Aggregation.

        //So Car Can exists without AC
        Car c = new Car();
        c.showAc();


//        3.2.2. Compose class with Composition.

        //but Company cannot exsit without Employees
        Emplyee e1 = new Emplyee("A123" , "KHALID" , 03322345154);

        Emplyee e2 = new Emplyee("A124" , "Hammad" , 03322345154);

        List<Emplyee> emplst = new ArrayList<Emplyee>();
        emplst.add(e1);
        emplst.add(e2);

        Company comp = new Company(emplst);






//        4. Abstract class and interface. (difference) interface mulitple inheritance
//        (if both interfaces method same then what is the behaviour, abstract class and interface)



        //Example of Abstract class that  can extends only one abstract Or normal class
        ClassD obj=new ClassD();
        obj.show();



        //Example of interface that  can extends Multiple Interfaces
        Five.ClassD obj1=new Five.ClassD();
        obj1.show3();



    }
}
