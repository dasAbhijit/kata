package Kata4.DataMunging;

import Kata4.DataMunging.utility.DataFileReader;

import java.io.IOException;

public class Weather {
    private DataFileReader dataFileReader;

    public Weather(DataFileReader dataFileReader) {
        this.dataFileReader = dataFileReader;
    }

    public int findSmallestTempDiff(String fileName) throws IOException {
        String[] lines = dataFileReader.readDataFile(fileName);
        int serialNo = 100;
        int tempDiff = 100;
        short count = 1;
        for (String line : lines) {
            if (count > 2) {
                int tempDiffNew = Integer.parseInt(line.substring(6, 8).trim()) - Integer.parseInt(line.substring(12, 14).trim());
                if (tempDiffNew < tempDiff) {
                    tempDiff = tempDiffNew;
                    serialNo = Integer.parseInt(line.substring(2, 4).trim());
                }
            }
            count++;
        }
        return serialNo;
    }
}
