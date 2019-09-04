package KarateChop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    //recursion
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

    //library
    private int binarySearchLibrary(int value, int[] sortedArray) {
        if (Arrays.binarySearch(sortedArray, value) < 0) {
            return -1;
        }
        return Arrays.binarySearch(sortedArray, value);
    }

    //using lambda expression
    public int chop6(int value, int[] sortedArray) {
        Search iterativeSearch = (int[] arr, int left, int right) -> {
            if (right >= left) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == value)
                    return mid;
                if (arr[mid] > value)
                    return binarySearch(arr, left, mid - 1, value);
                return binarySearch(arr, mid + 1, right, value);
            }
            return -1;
        };
        return iterativeSearch.search(sortedArray, 0, sortedArray.length - 1);
    }

    public int chop7(int value, int[] sortedArray) {
        return binarySearchWithArraySlicingRecursion(value, sortedArray, 0);
    }

    //array slicing
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

    public int chop8(int value, int[] sortedArray) {
        return binarySearchWithForLoop(sortedArray, value);
    }

    // For loop
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


    public int chop9(int value, int[] sortedArray) {
        return convertingIntoList(sortedArray, value);
    }

    //Converting Array into List and using functions of List Interface
    private int convertingIntoList(int[] array, int value) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        if (list.contains(value)) {
            return list.indexOf(value);
        }
        return -1;

    }


    public int chop10(int value, int[] sortedArray) {
        return binarySearchWithWhileLoop(sortedArray, value);
    }

    //While loop
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

    @FunctionalInterface
    interface Search {
        int search(int[] sortedArray, int left, int right);
    }
}
