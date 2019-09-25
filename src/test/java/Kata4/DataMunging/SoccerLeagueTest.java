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
            Assert.assertEquals(soccerLeague.findSmallestDiffBetweenForAndAwayGoals("/Users/abhijitdas/Development/" +
                    "Practice/kata/src/main/java/Kata4/DataMunging/res/football.dat"), "Aston_Villa");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}