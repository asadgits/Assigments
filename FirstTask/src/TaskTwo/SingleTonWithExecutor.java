package TaskTwo;

public class SingleTonWithExecutor {

    private static SingleTonWithExecutor ston;

    private SingleTonWithExecutor() {
    }

    ;

    public static SingleTonWithExecutor getObject() {
        if (ston == null) {
            synchronized (SingleTonWithExecutor.class) {
                if (ston == null)
                    ston = new SingleTonWithExecutor();
            }

        }
        return ston;

    }
}