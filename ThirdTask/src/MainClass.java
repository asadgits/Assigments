import fifth.Fifth;
import first.First;
import fourth.Fourth;
import second.Second;
import third.Third;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String abc[]){




//        "1. Write a java program to understand the difference between String literal and String Object. Also use ""equals()"" method and ""=="" operator to compare these Strings.

        First first = new First();
        first.run();


//        2. Write a java program to compare two Strings using ""compareTo()"" method.

          Second second = new Second();

//        compareTo() method first of all it works in lexicographically  order MEANS it compare words by picking one by one
//        when it starts comparing it gets first character of a String then compare it with first character of a Second
//        variable if thay are same in CASE and value it retruns 0 when variable has only one character

//        If variables had multiple characters firstly it compares first character of both variables if thay has same CASE and
//        value then it takes Second character and compares them if thay also has same case and value it takes third one
//        and compares it if third character has different case or value it returns its difference and stops the comperision and didnot
//        go further comperision of characters


//        3. Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
//        also traverse through both the Strings and print the traversal time in milliseconds. Also observe which String class is faster than the other.

        Third third = new Third();

        System.out.println("STRING BUILDER RESULT !!!!!!!!");
        third.testStringBuilder();

        System.out.println("STRING BUILDER RESULT !!!!!!!!");
        third.testStringBuffer();

//        4. Write a java program to capitalize each word in string.
        Fourth fourth = new Fourth();
        fourth.run();


//        5. Write a Java program to count the number of Prime Numbers less than a given positive number.
//         Hint: To complete the above program, you can also start with a program to find if any given number is prime or not?"
//
        Fifth fifth = new Fifth( 50);

        System.out.println("Numbers of Prime Numbers: " + fifth.count());



    




    }







}
