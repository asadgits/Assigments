package first;

public class First {

    public void run(){


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



    }
}
