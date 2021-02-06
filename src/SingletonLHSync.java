public class SingletonLHSync {
    private static SingletonLHSync instance;

    private SingletonLHSync() {

    }

    public static synchronized SingletonLHSync getInstance() {
        if (instance == null) {
            instance = new SingletonLHSync();
        }
        return instance;
    }
}
