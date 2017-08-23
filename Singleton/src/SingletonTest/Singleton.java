public class Singleton {
    private static Singleton instance;
    public static int UselessCounter;
    private Singleton(){}

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null){
            localInstance.UselessCounter = 0;
            localInstance = new Singleton();
            instance = localInstance;
        }
        return localInstance;
    }
}
