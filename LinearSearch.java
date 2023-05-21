// LinearSearch class implementing the linear search algorithm
public class LinearSearch {
    private int[] array;
    
    // Constructor to initialize the array
    public LinearSearch(int[] array) {
        this.array = array;
    }
    
    // Linear search method
    public int search(int target) {
        for (int i = 0; i < array.length; i++) {
            // Check if the target is found at the current position
            if (array[i] == target) {
                return i;
            }
        }
        
        // If the target is not found, return -1
        return -1;
    }
    
    // Main method to test the linear search implementation
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        LinearSearch linearSearch = new LinearSearch(array);
        
        int target = 23;
        int index = linearSearch.search(target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
