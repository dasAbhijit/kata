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
        } else if (sortedArray[mid] < value && mid + 1 <= sortedArray.length - 1) {
            int[] temp = Arrays.copyOfRange(sortedArray, mid, sortedArray.length);
            int returnValue = binarySearchWithArraySlicingRecursion(value, temp, mid);
            if (returnValue != -1) {
                return mid + returnValue;
            } else {
                return -1;
            }
        } else if (sortedArray[mid] > value && mid - 1 >= 0) {
            return binarySearchWithArraySlicingRecursion(value, Arrays.copyOf(sortedArray, mid), 0);
        }
        return -1;
    }
}
