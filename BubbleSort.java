// BubbleSort class implementing the bubble sort algorithm
public class BubbleSort {
    private int[] array;

    // Constructor to initialize the array
    public BubbleSort(int[] array) {
        this.array = array;
    }

    // Bubble sort method
    public void sort() {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap them if the order is incorrect
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the bubble sort implementation
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 16, 1, 23, 38, 9, 72};
        BubbleSort bubbleSort = new BubbleSort(array);

        System.out.println("Array before sorting: ");
        bubbleSort.printArray();

        bubbleSort.sort();

        System.out.println("Array after sorting: ");
        bubbleSort.printArray();
    }

    // Utility method to print the array
    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
