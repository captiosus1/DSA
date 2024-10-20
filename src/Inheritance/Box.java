package Inheritance;

import java.awt.*;

public class Box{
    int height;
    int length;
    int breadth;

    void display(){
        System.out.println("box");
    }
    Box(){
        this.height =-1;
        this.breadth =-1;
        this.length=-1;
    }

    Box(int height, int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    Box(Box oldBox){
        this.height=oldBox.height;
        this.breadth=oldBox.breadth;
        this.length=oldBox.length;
    }
}
