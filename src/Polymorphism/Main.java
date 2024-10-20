package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle  = new Circle();
        Shape square = new Square();
        shape.area();
        ArrayList<Integer> list = new ArrayList<>();
        circle.area();
        square.area();
    }
}
