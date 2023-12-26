package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;
    public static ConfigReader instance;

    private ConfigReader(){
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/resources/properties/config.properties");
            prop = new Properties();
            prop.load(fis);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static ConfigReader getInstance(){
        if (instance == null){
            instance = new ConfigReader();
        }
        return instance;
    }

    public String getUrl(){
        return prop.getProperty("url");
    }

    public String getBrowser(){
        return prop.getProperty("browser");
    }
}
