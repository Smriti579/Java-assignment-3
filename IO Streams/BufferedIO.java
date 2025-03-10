import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class BufferedIOExample {
    public static void main(String[] args) {
        String content = "This is a sample text with buffered I/O.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exampleBuffered.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("exampleBuffered.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
