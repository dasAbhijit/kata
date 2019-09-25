package Kata4.DataMunging;

import Kata4.DataMunging.utility.DataFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WeatherTest {

    @Test
    public void testDayNoWithSmallestTempSpread() {
        Weather weather = new Weather(new DataFileReader());
        try {
            Assert.assertEquals(weather.findSmallestTempDiff("/Users/abhijitdas/Development/" +
                    "Practice/kata/src/main/java/Kata4/DataMunging/res/weather.dat"), 14);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
