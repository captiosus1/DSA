package StacksandQueues;

public class DynamicStack extends CustomeStack{
    DynamicStack(){
        super();
    }

    DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int num) throws StackException{
        if(isFull()){
            //creating an array of twice the length
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        super.push(num);
    }
}
