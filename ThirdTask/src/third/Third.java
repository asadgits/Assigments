package third;

public class Third {
    public static void testStringBuffer(){
        long starttime = System.nanoTime();

        StringBuffer sb = new StringBuffer("Java is an Object Oriented Language");
        int length = sb.length();
        int i = 0;
        for (; i < length; i++)
            System.out.println("char no : "+(i+1)+" char is : "+ sb.charAt(i));

        long mytime = System.nanoTime() - starttime;

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

        System.out.println((mytime/100000));
    }

}
