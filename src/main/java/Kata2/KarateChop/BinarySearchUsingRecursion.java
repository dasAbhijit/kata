package Kata2.KarateChop;

public class BinarySearchUsingRecursion implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return binaryRecursiveSearch(sortedArray, 0, sortedArray.length - 1, value);
    }

    public int binaryRecursiveSearch(int arr[], int left, int right, int value) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binaryRecursiveSearch(arr, left, mid - 1, value);
            return binaryRecursiveSearch(arr, mid + 1, right, value);
        }
        return -1;
    }
}
