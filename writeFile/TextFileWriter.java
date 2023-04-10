package writeFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    private final String fileName;

    public TextFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeToFile(String data) {
        try {
            String projectPath = System.getProperty("user.dir");
            String filePath = projectPath + "/" + fileName;
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
