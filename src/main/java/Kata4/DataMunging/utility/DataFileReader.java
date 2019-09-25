package Kata4.DataMunging.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DataFileReader {

    public String[] readDataFile(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath()).toArray(new String[0]);
    }

}
