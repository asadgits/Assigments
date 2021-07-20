package threePointTwo;
import TaskOne.Student;



    public class BigSchoolingSystem {

        School RegisterSchool = new School("Iqra raza tus salam" , "AS321");
        public Student RegisterStudent = new Student();


        public  void printSchool(){
            System.out.println(RegisterSchool.branchName);
        }
        public  void printStudent(){
            System.out.println(RegisterStudent.getName());
            System.out.println(RegisterStudent.getFatherName());
            System.out.println(RegisterStudent.getRollNo());

        }

    }

//    class School{
//            String branchName;
//            String RegisterationNumber;
//
//            public School(String name , String RegNo){
//                this.branchName = name;
//                this.RegisterationNumber = RegNo;
//
//            }
//
//    }
//
//class Student {
//
//    String Name ;
//    String fatherName;
//    String RollNo ;
//
//
//    public  Student(){};
//
//    public  Student(String name , String fname , String rollno){
//        Name = name;
//        fatherName = fname ;
//        RollNo = rollno;
//
//    }


