package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;
    public static ConfigReader instance;

    private FileInputStream fis;

    private ConfigReader() {
        try {
            fis = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/resources/properties/config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static ConfigReader getInstance() {
        if (instance == null) {
            instance = new ConfigReader();
        }
        return instance;
    }

    public String getUrl() {
        return prop.getProperty("url");
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }
}
