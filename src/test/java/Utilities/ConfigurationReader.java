package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the object of Properties
    private static Properties configFile;

    static {

        try {
            //2- We need to open the file in java memory: FileInputStream
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);

            //3- Load the properties object using FileInputStream object
            configFile = new Properties();
            configFile.load(input);

            // close the file
            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
}
