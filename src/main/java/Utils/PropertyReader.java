package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String readKey(String key){

        String filePath = System.getProperty("user.dir")+"/src/test/Resource/Data.properties";

        try {
            FileInputStream file = new FileInputStream(filePath);

            Properties p = new Properties();
            p.load(file);

            return p.getProperty(key);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
