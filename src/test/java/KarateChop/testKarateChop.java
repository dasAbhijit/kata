package KarateChop;

import org.junit.Assert;
import org.junit.Test;

public class testKarateChop {
    private KarateChop karateChop = new KarateChop();
    private int[] arrayLengthZero = {};
    private int[] arrayLengthOne = {1};
    private int[] arrayLengthThree = {1, 3, 5};
    private int[] arrayLengthFour = {1, 3, 5, 7};

    @Test
    public void testChop1() {
        Assert.assertEquals(-1, karateChop.chop1(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop1(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop1(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop1(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop1(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop1(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop1(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop1(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop1(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop1(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop1(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop1(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop1(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop1(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop1(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop1(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop1(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop1(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop1(8, arrayLengthFour));
    }

    @Test
    public void testChop2() {
        Assert.assertEquals(-1, karateChop.chop2(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop2(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop2(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop2(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop2(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop2(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop2(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop2(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop2(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop2(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop2(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop2(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop2(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop2(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop2(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop2(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop2(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop2(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop2(8, arrayLengthFour));
    }

    @Test
    public void testChop3() {
        Assert.assertEquals(-1, karateChop.chop3(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop3(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop3(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop3(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop3(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop3(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop3(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop3(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop3(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop3(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop3(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop3(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop3(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop3(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop3(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop3(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop3(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop3(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop3(8, arrayLengthFour));
    }

    @Test
    public void testChop4() {
        Assert.assertEquals(-1, karateChop.chop4(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop4(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop4(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop4(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop4(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop4(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop4(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop4(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop4(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop4(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop4(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop4(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop4(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop4(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop4(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop4(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop4(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop4(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop4(8, arrayLengthFour));
    }

    @Test
    public void testChop5() {
        Assert.assertEquals(-1, karateChop.chop5(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop5(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop5(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop5(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop5(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop5(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop5(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop5(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop5(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop5(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop5(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop5(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop5(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop5(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop5(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop5(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop5(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop5(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop5(8, arrayLengthFour));
    }

    @Test
    public void testChop6() {
        Assert.assertEquals(-1, karateChop.chop6(3, arrayLengthZero));

        Assert.assertEquals(-1, karateChop.chop6(3, arrayLengthOne));
        Assert.assertEquals(0, karateChop.chop6(1, arrayLengthOne));

        Assert.assertEquals(0, karateChop.chop6(1, arrayLengthThree));
        Assert.assertEquals(1, karateChop.chop6(3, arrayLengthThree));
        Assert.assertEquals(2, karateChop.chop6(5, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop6(0, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop6(2, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop6(4, arrayLengthThree));
        Assert.assertEquals(-1, karateChop.chop6(6, arrayLengthThree));

        Assert.assertEquals(0, karateChop.chop6(1, arrayLengthFour));
        Assert.assertEquals(1, karateChop.chop6(3, arrayLengthFour));
        Assert.assertEquals(2, karateChop.chop6(5, arrayLengthFour));
        Assert.assertEquals(3, karateChop.chop6(7, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop6(0, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop6(2, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop6(4, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop6(6, arrayLengthFour));
        Assert.assertEquals(-1, karateChop.chop6(8, arrayLengthFour));
    }

}
