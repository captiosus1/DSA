package StacksandQueues;
import java.util.*;

public class TwoStackGame{
    public static int twoStacks(int maxSum, Stack<Integer> a, Stack<Integer> b) {
        return twoStacksHelper(maxSum, 0, 0, a, b);
    }

    public static int twoStacksHelper(int maxSum, int currentSum, int count, Stack<Integer> a, Stack<Integer> b) {
        // Base case: if the sum exceeds maxSum, return the current count
        if (currentSum > maxSum) {
            return count - 1; // return previous count
        }

        int maxCount = count;

        // Try to add from stack `a`
        if (!a.isEmpty()) {
            int valueA = a.pop();
            maxCount = Math.max(maxCount, twoStacksHelper(maxSum, currentSum + valueA, count + 1, a, b));
            a.push(valueA); // backtrack
        }

        // Try to add from stack `b`
        if (!b.isEmpty()) {
            int valueB = b.pop();
            maxCount = Math.max(maxCount, twoStacksHelper(maxSum, currentSum + valueB, count + 1, a, b));
            b.push(valueB); // backtrack
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Stack<Integer> first = new Stack<>();
        first.push(6);
        first.push(5);
        first.push(4);
        first.push(3);
        first.push(2);
        first.push(1);

        Stack<Integer> second = new Stack<>();
        second.push(6);
        second.push(5);
        second.push(4);
        second.push(1);
        second.push(2);
        second.push(1);

        System.out.println(twoStacks(15, first, second));

    }
}
