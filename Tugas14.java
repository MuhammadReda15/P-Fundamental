import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tugas14 {
    public static void main(String[] args) {

        try {
            Path file = Paths.get("data.txt");
            byte[] data = Files.readAllBytes(file);
            String isi = new String(data);
            System.out.println(isi);
        } catch (IOException exception) {
      
        }
           
    }
}