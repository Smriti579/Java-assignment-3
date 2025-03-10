import java.io.File;
public class ListFilesInDirectory {
    public static void main(String[] args) {
        String directoryPath = "."; // Current directory
        File folder = new File(directoryPath);
        File[] files = folder.listFiles();
        if (files != null) {
            System.out.println("Files in directory:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory does not exist or is empty.");
        }
    }
}
