package three;

import first.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdMain {
    public static void main(String[] args) {

//        3. Write a java program that takes unsorted records of Students inside an ArrayList and
//        sorts them in ""Ascending Order"" according to student name.
//        NOTE: - If more than one students have same name, then sort the record according to age, in Ascending Order.
//        - Use Comparator to sort the Student objects inside the ArrayList.
//                - Student class field are ""id"", ""name"" and ""age""."

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student( 103,"KHALID","garden", 72));
        listStudent.add(new Student( 101,"ALI","garden", 72));
        listStudent.add(new Student( 102,"FAHAD","nazimabad", 90));
        listStudent.add(new Student( 101,"ZAHID","malir",30));
        listStudent.add(new Student( 101,"FAHAD","malir",60));
        listStudent.add(new Student( 101,"FAHAD","malir",20));
        listStudent.add(new Student( 101,"ZAHID","malir",15));


        Comparator<Student> stdFilter = new Comparator<Student>() {
            int check=1;
            @Override
            public int compare(Student o1, Student o2) {
                check =  o1.name.compareTo(o2.name);
                if(check != 0) {
                    return check;
                }
                else {
                    return o1.age.compareTo(o2.age);
//                    return  String.valueOf(o1.age).compareTo(String.valueOf(o2.age));
                }
            }
        };

        Collections.sort(listStudent,stdFilter );
        listStudent.stream().forEach(student -> System.out.println(student.name +" ->  "+student.age));
    }
}
