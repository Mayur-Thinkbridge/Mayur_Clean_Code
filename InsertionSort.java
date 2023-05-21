// InsertionSort class implementing the insertion sort algorithm
public class InsertionSort {
    private int[] array;
    
    // Constructor to initialize the array
    public InsertionSort(int[] array) {
        this.array = array;
    }
    
    // Insertion sort method
    public void sort() {
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Move elements of array[0..i-1] that are greater than the key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        }
    }
    
    // Main method to test the insertion sort implementation
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 16, 1, 23, 38, 9, 72};
        InsertionSort insertionSort = new InsertionSort(array);
        
        System.out.println("Array before sorting: ");
        insertionSort.printArray();
        
        insertionSort.sort();
        
        System.out.println("Array after sorting: ");
        insertionSort.printArray();
    }
    
    // Utility method to print the array
    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
