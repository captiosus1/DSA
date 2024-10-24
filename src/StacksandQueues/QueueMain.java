package StacksandQueues;

public class QueueMain {
    public static void main(String[] args) throws StackException {
        CustomQueue queue = new CustomQueue(10);
        queue.push(5);
        queue.push(10);
        queue.push(15);
        queue.push(20);
        queue.push(25);
        System.out.println(queue.pop());
    }
}
