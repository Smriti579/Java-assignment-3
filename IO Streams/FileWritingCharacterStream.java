import java.io.FileWriter;
import java.io.IOException;
public class WriteFileCharStream {
    public static void main(String[] args) {
        String content = "This is a sample text for writing.";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
