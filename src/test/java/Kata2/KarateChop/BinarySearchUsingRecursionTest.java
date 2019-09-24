package Kata2.KarateChop;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchUsingRecursionTest {
    IBinarySearch iBinarySearch;
    private int[] arrayLengthZero = {};
    private int[] arrayLengthOne = {1};
    private int[] arrayLengthThree = {1, 3, 5};
    private int[] arrayLengthFour = {1, 3, 5, 7};

    @Test
    public void binaryRecursiveSearchTest() {
        iBinarySearch = new BinarySearchUsingRecursion();

        Assert.assertEquals(-1, iBinarySearch.search(3, arrayLengthZero));

        Assert.assertEquals(0, iBinarySearch.search(1, arrayLengthOne));

        Assert.assertEquals(0, iBinarySearch.search(1, arrayLengthThree));
        Assert.assertEquals(1, iBinarySearch.search(3, arrayLengthThree));
        Assert.assertEquals(2, iBinarySearch.search(5, arrayLengthThree));
        Assert.assertEquals(-1, iBinarySearch.search(0, arrayLengthThree));
        Assert.assertEquals(-1, iBinarySearch.search(2, arrayLengthThree));
        Assert.assertEquals(-1, iBinarySearch.search(4, arrayLengthThree));
        Assert.assertEquals(-1, iBinarySearch.search(6, arrayLengthThree));

        Assert.assertEquals(0, iBinarySearch.search(1, arrayLengthFour));
        Assert.assertEquals(1, iBinarySearch.search(3, arrayLengthFour));
        Assert.assertEquals(2, iBinarySearch.search(5, arrayLengthFour));
        Assert.assertEquals(3, iBinarySearch.search(7, arrayLengthFour));
        Assert.assertEquals(-1, iBinarySearch.search(0, arrayLengthFour));
        Assert.assertEquals(-1, iBinarySearch.search(2, arrayLengthFour));
        Assert.assertEquals(-1, iBinarySearch.search(4, arrayLengthFour));
        Assert.assertEquals(-1, iBinarySearch.search(6, arrayLengthFour));
        Assert.assertEquals(-1, iBinarySearch.search(8, arrayLengthFour));
    }

}
