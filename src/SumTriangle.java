import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }

    private static void printTriangle(int[] a) {
        // Base case: If array size is 0, stop recursion
        if (a.length == 0) {
            return;
        }

        // Create a new array for the next level
        int[] nextLevel = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            nextLevel[i] = a[i] + a[i + 1];
        }

        // Recursive call to print the next level
        printTriangle(nextLevel);
        System.out.println(Arrays.toString(a));
    }
}
