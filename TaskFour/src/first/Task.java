package first;

import java.sql.SQLOutput;

public class Task {
    public static String customExceptionCheck(String text) {
        int length = 0;
            try {
                length  = text.length();
            }catch (NullPointerException npe){
                return "VARIABLE VALUE IS NULL So this exception is occurs :  " +  npe;
            }


        return ""+length;
    }
}
