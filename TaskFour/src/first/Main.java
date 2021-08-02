package first;

public class Main {
    public static void main(String[] args) {
        String text = null;
        if(null == text){
            throw new CustomNullPointerException("STRING NULL POINTER EXCEPTION CUSTOM");
        }
    }

//    public static void checkNull(String text){
//
//        if(null == text){
//            throw new CustomNullPointerException("STRING NULL POINTER EXCEPTION CUSTOM");
//        }
//
//    }
}
