public class MainClass {
    public static void main(String abc[]){

//        "1. Write a java program to understand the difference between String literal and String Object. Also use ""equals()"" method and ""=="" operator to compare these Strings.

        String first = "Helloworld";
        String second = "Helloworld";
        System.out.println(first.hashCode());
        System.out.println("It matches only stack memory values rather thay are value or address " + first == second);
//        basically the concept is "==" matches the values in stack memory like  when we create a variable [String first]
//        it creats block in string pool in heap memory because it is String literal and stores its address in stack memory
//        like first : 101
//        then we create variable String second it is also a string litral and its value is same as String first  it save
//        in stack memory like second : 101
//        And .equals() method checks the value on the location which is stored in Heap memory OR another reference
//        variable's reference

        System.out.println(first.equals(second));
//        so equals() method goes to the end of the addresses and at the end it matches the ultimate value on the address
//        and == only matches  the value which are in the stack memory

        String fourth = new String("Helloworld");
        String fifth = new String("Helloworld");

        System.out.println(fifth == fourth); // these variables have different hashcode which are saved in stack memory so result is false

        System.out.println(fifth.equals(fourth));// these variables has same values which are ultimately same in heap memory




//        2. Write a java program to compare two Strings using ""compareTo()"" method.
                    

//        3. Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
//        also traverse through both the Strings and print the traversal time in milliseconds. Also observe which String class is faster than the other.
//
//        4. Write a java program to capitalize each word in string.
//
//        5. Write a Java program to count the number of Prime Numbers less than a given positive number.
//                Hint: To complete the above program, you can also start with a program to find if any given number is prime or not?"
//








    }
}
