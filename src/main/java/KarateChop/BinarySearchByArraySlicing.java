package KarateChop;

import java.util.Arrays;

public class BinarySearchByArraySlicing implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return binarySearchWithArraySlicingRecursion(value, sortedArray, 0);
    }

    private int binarySearchWithArraySlicingRecursion(int value, int[] sortedArray, int mid) {
        if (sortedArray.length <= 0) {
            return -1;
        }
        mid = sortedArray.length / 2;
        if (sortedArray[mid] == value) {
            return mid;
        } else if (occursInSecondPart(value, sortedArray, mid)) {
            int[] temp = Arrays.copyOfRange(sortedArray, mid, sortedArray.length);
            int returnValue = binarySearchWithArraySlicingRecursion(value, temp, mid);
            if (returnValue != -1) {
                return mid + returnValue;
            } else {
                return -1;
            }
        } else if (occursInFirstPart(value, sortedArray, mid)) {
            return binarySearchWithArraySlicingRecursion(value, Arrays.copyOf(sortedArray, mid), 0);
        }
        return -1;
    }

    private boolean occursInFirstPart(int value, int[] sortedArray, int mid) {
        return sortedArray[mid] > value && mid - 1 >= 0;
    }

    private boolean occursInSecondPart(int value, int[] sortedArray, int mid) {
        return sortedArray[mid] < value && mid + 1 <= sortedArray.length - 1;
    }
}
