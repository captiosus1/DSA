package StacksandQueues;

import java.util.Arrays;

public class CircularQueue {
    protected int[] data;
     int start=0;
     int end=0;
    private int DEFAULT_SIZE=10;
     int size=0;
    CircularQueue(){
        data = new int[10];
    }

    CircularQueue(int size){
        data=new int[size];
    }

    public void push(int num) throws StackException{
        if(isFull())
            throw new StackException("Queue is already full");

        data[end%data.length]=num;
        end++;
        size++;
    }

    public int pop() throws StackException{
        if(isEmpty())
            throw new StackException("Stack is already empty nothing to pop");

        int result = data[start% data.length];
        start++;
        size--;
        return result;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size== data.length;
    }

    public void display(){
        int temp = 0;
        while(temp<size){
            System.out.print(data[(start+temp)%data.length]+" -> ");
            temp++;
        }
        System.out.print("END");
        System.out.println();
    }

}
