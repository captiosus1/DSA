package Generics;

import java.util.Arrays;

public class CustomArrayList {
    int[] data;
    int size;
    int DEFAULT_SIZE=10;

    CustomArrayList(){
        data=new int[DEFAULT_SIZE];
    }

    protected void add(int val){
        if(isFull()){
            newArray();
        }
        data[size++]=val;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void newArray(){
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    protected boolean remove(){
        if(isEmpty())
            return false;
        size--;
        return true;
    }

    private boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


}
