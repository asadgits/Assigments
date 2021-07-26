package fifth;

public class Fifth {
//    public  void checkPrime(int n){
//        int loopStart,givenNumberDividebytwo=0,flag=0;
//        givenNumberDividebytwo=n/2;
//        if(n==0||n==1){
//            System.out.println(n+" is not prime number");
//        }else{
//            for(loopStart=2;loopStart<=givenNumberDividebytwo;loopStart++){
//                if(n%loopStart==0){
//                    System.out.println(n+" is not prime number");
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0)  { System.out.println(n+" is prime number"); }
//        }//end of else
//    }


    public static boolean isPrime(int n) {
        int count=0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }else{
                count++;
            }
        }
        return true;
    }


}
