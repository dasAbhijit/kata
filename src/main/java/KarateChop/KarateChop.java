package KarateChop;

import java.util.Arrays;

public class KarateChop {

    public int chop1(int value, int[] sortedArray) {
        return linerSearch(value, sortedArray);
    }

    private int linerSearch(int value, int[] sortedArray) {
        for (int index = 0; index < sortedArray.length; index++) {
            if (value == sortedArray[index]) {
                return index;
            }
        }
        return -1;
    }

    public int chop2(int value, int[] sortedArray) {
        return recSearch(sortedArray, 0, sortedArray.length - 1, value);
    }

    private int recSearch(int[] sortedArray, int left, int right, int value) {
        if (right < left)
            return -1;
        if (sortedArray[left] == value)
            return left;
        if (sortedArray[right] == value)
            return right;
        return recSearch(sortedArray, left + 1, right - 1, value);
    }

    public int chop3(int value, int[] sortedArray) {
        return binarySearch(sortedArray, 0, sortedArray.length - 1, value);
    }

    private int binarySearch(int arr[], int left, int right, int value) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, left, mid - 1, value);
            return binarySearch(arr, mid + 1, right, value);
        }
        return -1;
    }

    public int chop4(int value, int[] sortedArray) {
        return jumpSearch(sortedArray, 2, value);
    }

    private int jumpSearch(int arr[], int jumpBy, int value) {
        int jumpIndex;
        for (jumpIndex = 0; jumpIndex <= arr.length - 1; jumpIndex = jumpIndex + jumpBy) {
            if (arr[jumpIndex] == value) {
                return jumpIndex;
            }
            if (arr[jumpIndex] > value) {
                int startIndex = jumpIndex - jumpBy;
                if (startIndex < 0) startIndex = 0;
                return iterativeSearchFromIndex(startIndex, jumpIndex, arr, value);
            }
        }
        if (jumpIndex >= arr.length && arr.length != 0) {
            return iterativeSearchFromIndex(jumpIndex - jumpBy, arr.length - 1, arr, value);
        }

        return -1;
    }

    private int iterativeSearchFromIndex(int fromIndex, int toIndex, int[] sortedArray, int value) {
        for (int index = fromIndex; index <= toIndex; index++) {
            if (value == sortedArray[index]) {
                return index;
            }
        }
        return -1;
    }

    public int chop5(int value, int[] sortedArray) {
        return binarySearchLibrary(value, sortedArray);
    }

    private int binarySearchLibrary(int value, int[] sortedArray) {
        if (Arrays.binarySearch(sortedArray, value) < 0) {
            return -1;
        }
        return Arrays.binarySearch(sortedArray, value);
    }

    public int chop6(int value, int[] sortedArray) {
        Search iterativeSearch = (int v, int[] arr) -> {
            for (int index = 0; index < arr.length; index++) {
                if (v == arr[index]) {
                    return index;
                }
            }
            return -1;
        };
        return iterativeSearch.search(value, sortedArray);
    }

    @FunctionalInterface
    interface Search {
        int search(int value, int[] sortedArray);
    }

}
