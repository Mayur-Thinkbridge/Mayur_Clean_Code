// MergeSort class implementing the merge sort algorithm
public class MergeSort {
    private int[] array;

    // Constructor to initialize the array
    public MergeSort(int[] array) {
        this.array = array;
    }

    // Merge sort method
    public void sort() {
        mergeSort(array, 0, array.length - 1);
    }

    // Recursive helper method for merge sort
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursive call to sort the left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two subarrays of the array
    private void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method to test the merge sort implementation
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 16, 1, 23, 38, 9, 72};
        MergeSort mergeSort = new MergeSort(array);

        System.out.println("Array before sorting: ");
        mergeSort.printArray();

        mergeSort.sort();

        System.out.println("Array after sorting: ");
        mergeSort.printArray();
    }

    // Utility method to print the array
    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
