package first;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FirstMain {
    public static void main(String[] args) {
//        "1. Write a program in java that searches a perticular item from an ArrayList(items are sorted)
//        using JAVA COLLECTION API search methods.

//        List<Student> list = new ArrayList<Student>();
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student( 103,"KHALID","garden", 72));
        listStudent.add(new Student( 102,"HAMMAD","nazimabad", 35));
        listStudent.add(new Student( 101,"FAHAD","malir",27));

        Collections.sort(listStudent, (s1,s2)->s1.name.compareTo(s2.name));
        listStudent.stream().forEach(Student -> System.out.println(Student.name));
        Stream<Student> studentStream = listStudent.stream();

        Student student = studentStream.filter(Student -> "KHALID".equals(Student.name)).findAny().orElse(null);
        System.out.println(student.address);











    }
}
