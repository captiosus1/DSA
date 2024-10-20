package Inheritance;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(int weight){
        super();
        this.weight=weight;
    }

    BoxWeight(int weight,int height, int length, int breadth){
        this.weight=weight;
        this.breadth=breadth;
        this.length=length;
        this.height=height;
    }

    BoxWeight(BoxWeight otherbox){
        super(otherbox);
        this.weight = otherbox.weight;
    }


}
