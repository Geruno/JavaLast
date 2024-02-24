package Model;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void writeFile(String data, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(data);
            fw.append("\n");
            fw.flush();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}