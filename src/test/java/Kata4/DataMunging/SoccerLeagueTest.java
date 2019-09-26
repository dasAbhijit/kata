package Kata4.DataMunging;

import Kata4.DataMunging.utility.DataFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SoccerLeagueTest {

    @Test
    public void testTeamNameWithSmallestGoalDiff() {
        SoccerLeague soccerLeague = new SoccerLeague(new DataFileReader());
        try {
            String expectedName = soccerLeague.findSmallestDiffBetweenForAndAwayGoals("/Users/abhijitdas/Development/" +
                    "Practice/kata/src/main/java/Kata4/DataMunging/res/football.dat");
            Assert.assertTrue(expectedName.equals("Aston_Villa"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}