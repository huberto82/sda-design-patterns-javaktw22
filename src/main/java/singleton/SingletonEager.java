package singleton;

public class SingletonEager {
    public static final String MESSAGE = "Message";
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        System.out.println("Instance created");
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
