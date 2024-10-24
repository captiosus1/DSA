package StacksandQueues;

public class DynamicCircularQueue extends CircularQueue{
    DynamicCircularQueue(){
        super();
    }

    DynamicCircularQueue(int num){
        super(num);
    }

    @Override
    public void push(int num) throws StackException{
        if(isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(start+size)%data.length];
            }
            data=temp;
        }
        super.push(num);
    }
}
