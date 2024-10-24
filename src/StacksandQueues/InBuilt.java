package StacksandQueues;

import java.util.*;

public class InBuilt {
    public static void main(String[] args) {
        //stack is an implementation of arrays
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.peek();
        stack.pop();

        //queue is a interface so it needs to implemnetd by linkedlist
        Queue<Integer> queue = new LinkedList<>();
        queue.add(50);
        queue.add(100);
        queue.add(150);
        queue.add(200);
        queue.poll();
        queue.remove();
        queue.peek();
        queue.offer(54);


        //deque is also an interface and it needs arraydeque . it had queue functinalites but from both sides.
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.peek();
        deque.addFirst(5);
        deque.addLast(58);
        deque.removeLast();
    }
}

/**
 * Key Explanations:
 * Stack: Operates on a Last-In-First-Out (LIFO) principle, where the last element added is the first to be removed. The key operations are:
 *
 * push(): Adds elements to the top.
 * pop(): Removes the top element.
 * peek(): Checks the top element without removing it.
 * Queue: Operates on a First-In-First-Out (FIFO) principle, where the first element added is the first to be removed. The key operations are:
 *
 * add(): Adds elements to the tail.
 * poll()/remove(): Removes the head.
 * peek(): Checks the head element without removing it.
 * offer(): Adds elements to the tail (alternative to add()).
 * Deque (Double-ended Queue): Allows insertion and removal from both ends:
 *
 * addFirst(): Adds elements to the front.
 * addLast(): Adds elements to the back (same as add()).
 * removeLast(): Removes the last element.
 * peek(): Checks the first element without removing it.
 */
