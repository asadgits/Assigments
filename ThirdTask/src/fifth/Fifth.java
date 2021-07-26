package fifth;

public class Fifth {

    private final int Range;


    public int count() {
        return countPrimeNumbers(Range);
    }

    public Fifth(int Range) {
        this.Range = Range;

    }

    private int countPrimeNumbers(int Range) {

        int flag;
        int count = 0;
        for (int i = 2; i < Range; i++) {
            flag=1;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                System.out.println(j);
            }
            if (flag == 1) {
                count++;
            }
        }
    return count;
    }



}


