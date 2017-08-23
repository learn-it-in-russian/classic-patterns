
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ConfigContainer {
    private static ConfigContainer container;
    private static Map<String, String> configHash = new HashMap<String, String>();
    private ConfigContainer(){};

    private static void readConfig(){
        //starts once in class initialisation
        try{
            FileInputStream fileStream = new FileInputStream("./src/config.conf");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            String line = reader.readLine();
            while(line != null){
                String[] options = line.split("=");
                configHash.put(options[0], options[1]);
                line = reader.readLine();
            }
            System.out.println("Readed config!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String getConfig(String confLine){
        System.out.println("Got config option!");
        if (configHash.containsKey(confLine)){
            return configHash.get(confLine);
        } else return null;
    }

    public static ConfigContainer getInstance(){
        if (container == null){
            System.out.println("ConfigContainer initialised!");
            container = new ConfigContainer();
            container.readConfig();
        }
        System.out.println("Container instance returned!");
        return container;
    }
}
