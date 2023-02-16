package helper;

import java.io.*;
import java.util.Properties;

public class PropertyReader {
    public static String valueOf(String property) throws FileNotFoundException {
        File file = new File("src/test/resources/settings/ProjectSettings.properties");
        Properties prop = new Properties();
        InputStream input=null;

        try  {
            input = new FileInputStream(file);
            prop.load(input);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return prop.getProperty(property).trim();
    }
}
