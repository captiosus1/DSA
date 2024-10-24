package StacksandQueues;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private int pointer=-1;
    private int DEFAULT_SIZE=10;
    CustomQueue(){
        data = new int[10];
    }

    CustomQueue(int size){
        data=new int[size];
    }

    public void push(int num)  throws StackException{

        if(isFull())
            throw new StackException("Queue is full : can not perform push()");

        pointer++;
        data[pointer]=num;
    }

    public int pop() throws StackException{
        if(isEmpty())
            throw new StackException("Queue is Empty");
        int result = data[0];
        for(int i=0;i<data.length-1;i++){
            data[i]=data[i++];
        }
        data[pointer]=0;
        pointer--;
        return result;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    public boolean isEmpty(){
        if(pointer==-1)
            return true;
        return false;
    }

    public boolean isFull(){
        return pointer== data.length-1;
    }
}
