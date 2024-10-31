package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T extends Number> {
    Object[] data;
    int size;
    int DEFAULT_SIZE=10;

    CustomGenericArrayList(){
        data=new Object[DEFAULT_SIZE];
    }

    protected void add(T val){
        if(isFull()){
            newArray();
        }
        data[size++]=val;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void newArray(){
        Object[] temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    protected T remove(){

        return (T)data[size--];
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
