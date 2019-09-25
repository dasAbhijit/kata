package Kata4.DataMunging;

import Kata4.DataMunging.utility.DataFileReader;

import java.io.IOException;

public class SoccerLeague {
    private DataFileReader dataFileReader;

    public SoccerLeague(DataFileReader dataFileReader) {
        this.dataFileReader = dataFileReader;
    }

    public String findSmallestDiffBetweenForAndAwayGoals(String fileName) throws IOException {
        String[] lines = dataFileReader.readDataFile(fileName);
        short count = 1;
        String teamName = "no Team";
        int goalDIff = 100;
        for (String line : lines) {
            try {
                int forGoal = Integer.parseInt(line.substring(43, 45));
                int againstGoal = Integer.parseInt(line.substring(51, 52));
                if (forGoal > againstGoal) {
                    if (forGoal - againstGoal < goalDIff) {
                        goalDIff = forGoal - againstGoal;
                        teamName = line.substring(7, 21);
                    }
                } else {
                    if (againstGoal - forGoal < goalDIff) {
                        goalDIff = againstGoal - forGoal;
                        teamName = line.substring(7, 21);
                    }
                }
            }catch (NumberFormatException e){

            }
            count++;
        }
        return teamName;
    }

}
