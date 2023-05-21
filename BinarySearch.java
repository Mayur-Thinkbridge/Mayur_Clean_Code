// BinarySearch class implementing the binary search algorithm
public class BinarySearch {
    private int[] array;
    
    // Constructor to initialize the array
    public BinarySearch(int[] array) {
        this.array = array;
    }
    
    // Binary search method
    public int search(int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            
            if (array[mid] == target) {
                return mid;
            }
            
            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // If the target is not found, return -1
        return -1;
    }
    
    // Main method to test the binary search implementation
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        BinarySearch binarySearch = new BinarySearch(array);
        
        int target = 23;
        int index = binarySearch.search(target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
