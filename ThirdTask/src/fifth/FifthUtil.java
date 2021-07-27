package fifth;

public final class FifthUtil {

    private FifthUtil(){};

    public static int count(int range) {
        return countPrimeNumbers(range);
    }


    private static int countPrimeNumbers(int Range) {

        int flag;
        int count = 0;
        for (int i = 2; i < Range; i++) {
            flag=1;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
    return count;
    }



}


