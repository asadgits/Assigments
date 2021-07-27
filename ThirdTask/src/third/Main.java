package third;

public class Main {
    public static void main(String[] args) {

//        3. Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
//        also traverse through both the Strings and print the traversal time in milliseconds. Also observe which String class is faster than the other.

        Third third = new Third();
        System.out.println("STRING Buffer RESULT !!!!!!!!");
        third.testStringBuffer();

        System.out.println("STRING BUILDER RESULT !!!!!!!!");
        third.testStringBuilder();


    }
}
