import java.io.FileReader;
import java.io.IOException;
public class ReadFileCharStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
