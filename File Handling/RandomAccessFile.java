import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("randomfile.txt", "rw")) {
            raf.writeUTF("Hello, Random Access File!");  // Write at the beginning
            raf.seek(0);  // Move pointer to beginning
            System.out.println("Read from file: " + raf.readUTF());
            raf.seek(7);  // Move pointer to position 7
            raf.writeUTF("Modified");  // Overwrite part of the text
            raf.seek(0);
            System.out.println("After modification: " + raf.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
