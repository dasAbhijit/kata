package KarateChop;

public class BinarySearchWithWhileLoop implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return binarySearchWithWhileLoop(sortedArray, value);
    }

    private int binarySearchWithWhileLoop(int[] sortedArray, int value) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (sortedArray[middle] == value) {
                return middle;
            } else if (sortedArray[middle] > value) {
                end = middle - 1;
            } else start = middle + 1;
        }
        return -1;
    }
}
