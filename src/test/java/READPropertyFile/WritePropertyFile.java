package READPropertyFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

    public static void main(String[] args) throws IOException {

        Properties pr = new Properties();
        pr.setProperty("URL","https://demowebshop.tricentis.com/");
        pr.setProperty("username","selenium2025@gmail.com");
        pr.setProperty("pwd","selenium");

        //Write into file
        String filePath= System.getProperty("user.dir")+"\\Data\\example.properties";
        FileOutputStream fo= new FileOutputStream(filePath);

        pr.store(fo, " Data in Prop FIle");
        fo.close();
    }
}
