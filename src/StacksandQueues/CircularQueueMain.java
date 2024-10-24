package StacksandQueues;

import java.util.Arrays;
import java.util.Date;

public class CircularQueueMain{
    public static void main(String[] args) throws StackException {
        CircularQueue queue = new DynamicCircularQueue(1);
        queue.push(5);
        queue.push(10);
        queue.push(15);
        queue.push(20);
        queue.push(54);
        queue.display();

        System.out.println(queue.pop());
        queue.display();

        queue.push(25);
        queue.display();

        System.out.println(queue.pop());
        queue.display();

        queue.push(56);
        queue.display();

    }
}
