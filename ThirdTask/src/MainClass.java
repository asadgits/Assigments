import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String abc[]){




//        "1. Write a java program to understand the difference between String literal and String Object. Also use ""equals()"" method and ""=="" operator to compare these Strings.

        String first = "Helloworld";
        String second = "Helloworld";
        System.out.println(first.hashCode());
        System.out.println("It matches only stack memory values rather thay are value or address " + first == second);
//        basically the concept is "==" matches the values in stack memory like  when we create a variable [String firstVar]
//        it creats block in string pool in heap memory because it is String literal and stores its address in stack memory
//        like firstVar : 101
//        then we create variable String secondVar it is also a string litral and its value is same as String firstVar  it save
//        in stack memory like secondVar : 101
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

        String firstVar = "aa";
        String secondVar = "aA";
        System.out.println("\n\n CompareTo() METHOD EXAMPLE : "+firstVar.compareTo(secondVar));

//        compareTo() method first of all it works in lexicographically  order MEANS it compare words by picking one by one
//        when it starts comparing it gets first character of a String then compare it with first character of a Second
//        variable if thay are same in CASE and value it retruns 0 when variable has only one character

//        If variables had multiple characters firstly it compares first character of both variables if thay has same CASE and
//        value then it takes Second character and compares them if thay also has same case and value it takes third one
//        and compares it if third character has different case or value it returns its difference and stops the comperision and didnot
//        go further comperision of characters


        //        3. Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
//        also traverse through both the Strings and print the traversal time in milliseconds. Also observe which String class is faster than the other.

        System.out.println("STRING BUILDER RESULT !!!!!!!!");
        testStringBuilder();

        System.out.println("STRING BUILDER RESULT !!!!!!!!");
        testStringBuffer();

//        4. Write a java program to capitalize each word in string.
            StringBuffer str1 = new StringBuffer();

            String abcd = "Java is an Object Oriented Language";
        for (int a: abcd.toCharArray()) {
            if(a>=97 && a<=122 ){
                a-= 32;
                str1.append((char)a);
            }
            else{
                str1.append((char)a);
            }
        }


        System.out.println("\n\n\n"+str1.toString());
//        5. Write a Java program to count the number of Prime Numbers less than a given positive number.
//         Hint: To complete the above program, you can also start with a program to find if any given number is prime or not?"
//

        








    }


        public static void testStringBuffer(){


            long starttime = System.nanoTime();

            StringBuffer sb = new StringBuffer("Java is an Object Oriented Language");
            int length = sb.length();
            int i = 0;
            for (; i < length; i++)
                System.out.println("char no : "+(i+1)+" char is : "+ sb.charAt(i));


            long mytime = System.nanoTime() - starttime;

            System.out.println(mytime);
            System.out.println((mytime/100000));
        }

    public static void testStringBuilder(){


        long starttime = System.nanoTime();

        StringBuilder sb = new StringBuilder("Java is an Object Oriented Language");
        int length = sb.length();
        int i = 0;
        for (; i < length; i++)
            System.out.println("char no : "+(i+1)+" char is : "+ sb.charAt(i));


        long mytime = System.nanoTime() - starttime;

        System.out.println(mytime);
        System.out.println((mytime/100000));
    }



}
