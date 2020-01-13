package singleton;

public class SignletonEagerDemo {
    public static void main(String[] args) {
        System.out.println(SingletonEager.MESSAGE);
        System.out.println("Hello");
        SingletonEager instance = SingletonEager.getInstance();
    }

}
