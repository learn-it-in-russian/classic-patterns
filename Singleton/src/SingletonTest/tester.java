
public class tester {
    public static void main(String[] args) {
        Singleton FirstInstance = Singleton.getInstance();
        System.out.println("FirstInstance.counter = " + FirstInstance.UselessCounter);
        FirstInstance.UselessCounter++;
        Singleton SecondInstance = Singleton.getInstance();
        System.out.println("SecondInstance.counter = " + SecondInstance.UselessCounter);
        FirstInstance.UselessCounter = 5;
        System.out.println("SecondInstance.counter = " + SecondInstance.UselessCounter);
    }
}
