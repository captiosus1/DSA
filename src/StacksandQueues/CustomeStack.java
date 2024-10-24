package StacksandQueues;

import java.util.Arrays;

public class CustomeStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int pointer=-1;
    public CustomeStack() {
        this(DEFAULT_SIZE);
    }

    public CustomeStack(int size){
        this.data = new int[size];
    }

    public void push(int num)  throws StackException{

        if(isFull())
            throw new StackException("Stack is full : can not perform push()");

        pointer++;
        data[pointer]=num;
    }

    public int pop() throws StackException{
        if(isEmpty())
            throw new StackException("Stack is empty can not perform pop");
        int result = data[pointer];
        data[pointer]=0;
        pointer--;

        return result;
    }

    public int peek() throws StackException{
        if(isEmpty())
            throw  new StackException("Stack is Empty");
        return data[pointer];
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

