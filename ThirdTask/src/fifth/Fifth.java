package fifth;

public class Fifth {

    private final int startRange;
    private final int EndRange;

    public int count() {
        return countPrimeNumbers(startRange , EndRange);
    }

    public Fifth(int startRange , int EndRange) {
        this.startRange = startRange;
        this.EndRange = EndRange;
    }

    private int countPrimeNumbers(int startRange , int EndRange){
        int count = 0;
        for (int i= startRange; i <= EndRange; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }



    private boolean isPrime(int n) {
        int count=0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }// for loop

        return true;
    }


}
