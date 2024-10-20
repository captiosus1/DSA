package Inheritance;

public class BoxPrice extends BoxWeight{
    int price;
    BoxPrice(){
        this.price=-1;
    }
    BoxPrice(int price){
        this.price=price;
    }
    BoxPrice(BoxPrice oldBoxPrice){
        super(oldBoxPrice);
        this.price=oldBoxPrice.price;
    }

    BoxPrice(int height, int length, int breadth, int weight, int price){
        this.price=price;
        this.breadth=breadth;
        this.height=height;
        this.length=length;
        this.weight=weight;
    }

    void display(){
        System.out.println("BoxPrice");
    }
}
