package KarateChop;

public class BinarySearchUsingLambdaExpression implements IBinarySearch {
    @Override
    public int search(int value, int[] sortedArray) {
        return searchWithLambdaExpression(value, sortedArray);
    }

    private int searchWithLambdaExpression(int value, int[] sortedArray) {
        BinaryRecursiveSearch binaryRecursiveSearch = new BinaryRecursiveSearch();
        Search iterativeSearch = (int[] arr, int left, int right) -> {
            if (right >= left) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == value)
                    return mid;
                if (arr[mid] > value)
                    return binaryRecursiveSearch.binaryRecursiveSearch(arr, left, mid - 1, value);
                return binaryRecursiveSearch.binaryRecursiveSearch(arr, mid + 1, right, value);
            }
            return -1;
        };
        return iterativeSearch.search(sortedArray, 0, sortedArray.length - 1);
    }
}
