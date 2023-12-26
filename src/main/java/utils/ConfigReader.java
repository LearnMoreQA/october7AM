package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties readProperty() throws IOException {
        // 1. File Input Stream (C) - Cover File format to Bytes
        // 2. Properties (C) - Helps to Retrieve the Key Value in properties File
        String rootFolder = System.getProperty("user.dir");
        System.out.println("Root Folder Path : "+rootFolder);
        FileInputStream fis = new FileInputStream(rootFolder +"/src/test/resources/properties/config.properties");
        prop = new Properties();
        prop.load(fis);
        return prop;
    }
    /*public static String getUrl(){
        return prop.getProperty("url");
    }*/


}
