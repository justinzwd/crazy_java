public class SingletonEH {
    private static SingletonEH instance = new SingletonEH();
    private SingletonEH() {

    }

    public static SingletonEH getInstance() {
        System.out.println("instance：" + instance);
        System.out.println("加载饿汉式");
        return instance;
    }
}
