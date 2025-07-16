package Files;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@Slf4j
public class filesAction {


    public static void createFile(String filepath) {

        File file = new File(filepath);
        try {
            if (file.createNewFile()) {
                System.out.println("New File Created." + filepath);
            } else {
                System.out.println("File already exist");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(String filepath) {
        try {
            FileWriter writer = new FileWriter(filepath);
            writer.write("Welcome to SDET-QA....");
            writer.close();
            System.out.println("Successfully wrote to file");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void readFromFile(String filepath) {

        File file = new File(filepath);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static void renameFile(String oldFilePath, String newFilePath) {

        File orignalFile = new File(oldFilePath);
        File newFile = new File(newFilePath);

        if (checkFileExist(oldFilePath)) {
            if (orignalFile.renameTo(newFile)) {
                System.out.println("File rename done" + newFile);
            }
        } else {
            System.out.println("File not Exist to rename");
        }


    }

    public static void deleteFile(String filepath) {

        File myFile = new File(filepath);

        if(myFile.delete()){
            System.out.println("File deleted "+myFile);
        }else{
            System.out.println("No Deletion");
        }



    }

    public static boolean checkFileExist(String filepath) {

        return new File(filepath).exists();
    }


    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "/src/main/java/Files/TestData/TestFile.txt";
        String newFilePath = System.getProperty("user.dir") + "/src/main/java/Files/TestData/TestFile_1.txt";

        createFile(filePath);
        writeToFile(filePath);
        readFromFile(filePath);
        renameFile(filePath, newFilePath);
        deleteFile(newFilePath);


    }
}
