package Files;

import java.io.File;

public class folderActions {

    public static void createFolder(String folderPath) {

        File file = new File(folderPath);

        // if files exist inside folder, we need to delete all the files first than the folder
        if (!checkFolderExist(folderPath)) {

            file.mkdir();
            System.out.println("new Folder created-->"+file.getName());

        } else {
            System.out.println("Folder already exist -->"+file.getName());
        }
    }


    public static void renameFolder(String folderPath, String newFolderPath) {

        File orignalName = new File(folderPath);
        File newName = new File(newFolderPath);

        // check folder exist
        if (checkFolderExist(folderPath)) {

            // rename file will rename the file and return boolean
            if (orignalName.renameTo(newName)) {
                System.out.println("Rename Folder to:" + newFolderPath);
            }
        }

    }

    public static void deleteFolder(String folderPath) {

        File folder = new File(folderPath);

        if (checkFolderExist(folderPath)) {

            for (File filesInFolder : folder.listFiles()) {
                filesInFolder.delete();
            }

            if (folder.delete()) {
                System.out.println("Deleted Folder:" + folderPath);

            }
        }
    }

    public static boolean checkFolderExist(String folderPath) {

        return new File(folderPath).exists();

    }


    public static void main(String[] args) {

        String folderPath = System.getProperty("user.dir") + "/src/main/java/Files/file1";
        String newFolderPath = System.getProperty("user.dir") + "/src/main/java/Files/file2";

        System.out.println(checkFolderExist(folderPath));

        createFolder(folderPath);

//        renameFolder(folderPath, newFolderPath);
//
//        deleteFolder(newFolderPath);

    }
}
