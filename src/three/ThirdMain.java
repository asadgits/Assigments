package three;

import first.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdMain {
    /**
     * @param args 3. Write a java program that takes unsorted records of Students inside an ArrayList and
     *             sorts them in ""Ascending Order"" according to student name.
     *             NOTE: - If more than one students have same name, then sort the record according to age, in Ascending Order.
     *             - Use Comparator to sort the Student objects inside the ArrayList.
     *             - Student class field are ""id"", ""name"" and ""age""."
     */
    public static void main(String[] args) {

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(103, "KHALID", "garden", 72));
        listStudent.add(new Student(101, "ALI", "garden", 72));
        listStudent.add(new Student(102, "FAHAD", "nazimabad", 90));
        listStudent.add(new Student(101, "ZAHID", "malir", 30));
        listStudent.add(new Student(101, "FAHAD", "malir", 60));
        listStudent.add(new Student(101, "FAHAD", "malir", 20));
        listStudent.add(new Student(101, "ZAHID", "malir", 15));

//        Comparator<Student> studentcomparator = (o1,o2) -> {
//            if (o1.getName().compareTo(o2.getName()) == 0) {
//                return o1.getAge().compareTo(o2.getAge());
//            }
//            return o1.getName().compareTo(o2.getName());
//        };

        listStudent.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return o1.getAge().compareTo(o2.getAge());
            }
            return o1.getName().compareTo(o2.getName());
        });
//      listStudent.forEach(student -> System.out.println(student.getName() +" ->  "+student.getAge()));
        listStudent.forEach(System.out::println);

    }
}
