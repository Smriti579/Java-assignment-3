import java.io.File;
import java.io.IOException;
public class FileExistenceCheck {
    public static void main(String[] args) {
        File file = new File("testfile.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
