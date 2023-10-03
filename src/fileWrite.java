import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public void filesWrite(String person, String path) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append(person);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}