package Array;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k in case it's greater than n
        int count = 0; // Tracks how many elements have been placed

        for (int start = 0; count < n; start++) {
            int current = start; // The current position we’re working on
            int prev = nums[start]; // Store the value at the starting position

            do {
                int next = (current + k) % n; // Calculate the next position for the element
                int temp = nums[next]; // Store the value at the next position
                nums[next] = prev; // Place the current element in its new position
                prev = temp; // Update prev with the displaced element
                current = next; // Move to the next position
                count++; // Increment the count of elements placed
            } while (start != current); // Stop the cycle once we return to the starting index
        }
    }
}




