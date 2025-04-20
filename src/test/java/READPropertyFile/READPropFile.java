package READPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class READPropFile {

public static void main(String[] args) throws IOException {
    Properties prop = new Properties();

    String filePath = System.getProperty("user.dir") + "\\Data\\example.properties";

    FileInputStream fi = new FileInputStream(filePath);
    prop.load(fi);
    fi.close();

    System.out.println(prop.getProperty("URL"));
    System.out.println(prop.getProperty("pwd"));
    System.out.println(prop.getProperty("username"));

}

}
