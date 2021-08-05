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
        listStudent.add(new Student( 103,"KHALID","garden"));
        listStudent.add(new Student( 102,"HAMMAD","nazimabad"));
        listStudent.add(new Student( 101,"FAHAD","malir"));

        Collections.sort(listStudent, (s1,s2)->s1.name.compareTo(s2.name));
//        listStudent.stream().forEach(Student -> System.out.println(Student.address));
        Stream<Student> studentStream = listStudent.stream();

        Student student = studentStream.filter(Student -> "KHALID".equals(Student.name)).findAny().orElse(null);
        System.out.println(student.address);

//        2. Write a java program that searches last item in an ArrayList and Linked List and prints the search time in
//        milliseconds to check which collection is faster in traversing and searching a perticular item.

//        NOTE: The data stored in both the collections is same and the item serched is also fixed according to position
//        in the collection.
//        e.g [23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100] and you are finding ""100""(last item) in
//        both the collections.

        List<Integer> FindLast = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        for (int a:
             FindLast) {
            if (FindLast.get(FindLast.size()-1) == a){

            }
        }



//        3. Write a java program that takes unsorted records of Students inside an ArrayList and sorts them in ""Ascending Order"" according to student name.
//        NOTE: - If more than one students have same name, then sort the record according to age, in Ascending Order.
//        - Use Comparator to sort the Student objects inside the ArrayList.
//                - Student class field are ""id"", ""name"" and ""age""."












    }
}
