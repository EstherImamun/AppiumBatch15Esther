package Utils.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;
    public static Properties readProperties(){
        try {
            FileInputStream file =new FileInputStream("src\\test\\resources\\Config\\config.properties");
            prop=new Properties();
            prop.load(file);
        } catch (IOException e) {
           e.getMessage();
        }
        return prop;
    }

    public static String getPropertyValue(String propKey){
        return prop.getProperty(propKey);

    }
}
