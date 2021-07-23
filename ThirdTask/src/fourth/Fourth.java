package fourth;

public class Fourth {
    public void run(){
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
    }
}
