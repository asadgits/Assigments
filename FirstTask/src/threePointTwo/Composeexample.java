package threePointTwo;

    public class Composeexample {

        School sc = new School("Iqra raza tus salam" , "AS321");
        Student s1 = new Student("khalid" , "KHAN" , "EP109385");

        public  void printSchool(){
            System.out.println(sc.name);
        }
        public  void printStudent(){
            System.out.println(s1.Name);
        }

    }

    class School{
            String name;
            String RegNo;

            public School(String name , String RegNo){
                this.name = name;
                this.RegNo = RegNo;

            }

    }

class Student {

    String Name ;
    String fName ;
    String RollNo ;


    public  Student(){};

    public  Student(String name , String fname , String rollno){
        Name = name;
        fName = fname ;
        RollNo = rollno;

    }


}


