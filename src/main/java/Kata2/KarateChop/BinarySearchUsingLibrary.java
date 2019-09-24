package Kata2.KarateChop;

import java.util.Arrays;

public class BinarySearchUsingLibrary implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return BinarySearchUsingBinarySearchLibrary(value, sortedArray);
    }

    private int BinarySearchUsingBinarySearchLibrary(int value, int[] sortedArray) {
        if (Arrays.binarySearch(sortedArray, value) < 0) {
            return -1;
        }
        return Arrays.binarySearch(sortedArray, value);
    }
}
