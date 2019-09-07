package KarateChop;

public class BinarySearchWithForLoop implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return binarySearchWithForLoop(sortedArray, value);
    }

    private int binarySearchWithForLoop(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            int middle = (right - left) / 2;
            if (array[i] == value) {
                return i;
            } else if (array[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
