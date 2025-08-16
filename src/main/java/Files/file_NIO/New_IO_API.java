package Files.file_NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class New_IO_API {

    public static void main(String[] args) {


        try {
            Path path = Paths.get(System.getProperty("user.dir") + "/src/main/java/Files/TestData/NIO/Exp");
            Files.createDirectories(path);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }

    }
}
