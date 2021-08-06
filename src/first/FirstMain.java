package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstMain {
    /**
     * @param args
     * "1. Write a program in java that searches a perticular item from an ArrayList(items are sorted)
     *         using JAVA COLLECTION API search methods.
     */
    public static void main(String[] args) {

        List<Student> listStudent = Arrays.asList(  new Student( 130,"KHALID","garden", 72),
                                                    new Student( 122,"HAMMAD","nazimabad", 35),
                                                    new Student( 101,"FAHAD","malir",27)
                                                    );

        listStudent.sort(Comparator.comparing(Student::getId));
        listStudent.forEach(Student -> System.out.println(Student.getId()+" -> "+Student.getName()));

        Student student = listStudent.stream().filter(Student -> "KHALID".equals(Student.getName())).findAny().orElse(null);
//        List<Student> studentList = listStudent.stream().filter(Student -> "KHALID".equals(Student.getName())).limit(4).collect(Collectors.toList());
        assert student != null;
        System.out.println(student.getAddress());











    }
}
