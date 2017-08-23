public class MainClass {
    private static void FunctionOne(){
        System.out.println("Entered Function One!");
        ConfigContainer confCont = ConfigContainer.getInstance();
        String opt1 = confCont.getConfig("attr1");
        System.out.println("Option one is: " + opt1);
    }

    private static void FunctionTwo(){
        System.out.println("Entered Function Two!");
        ConfigContainer confCont = ConfigContainer.getInstance();
        String opt2 = confCont.getConfig("attr2");
        System.out.println("Option one is: " + opt2);
    }

    private static void FunctionThree(){
        System.out.println("Entered Function Three!");
        ConfigContainer confCont = ConfigContainer.getInstance();
        String opt3 = confCont.getConfig("attr3");
        System.out.println("Option one is: " + opt3);
    }

    public static void main(String[] args){
//        System.out.println(System.getProperty("user.dir"));
        System.out.println("Use first function:");
        FunctionOne();
        System.out.println("Use second function:");
        FunctionTwo();
        System.out.println("Use third function:");
        FunctionThree();
    }
}
