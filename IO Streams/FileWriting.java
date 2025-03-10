import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFileByteStream {
    public static void main(String[] args) {
        String content = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
