package fifth;

public class Fifth {

    

    public static boolean isPrime(int n) {
        int count=0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }else{

                System.out.println(i);
            }
        }// for loop

        return true;
    }


}
