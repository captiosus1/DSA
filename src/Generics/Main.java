package Generics;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList array = new CustomArrayList();
//        for(int i=0;i<21;i++){
//            array.add(i*2);
//        }
//        System.out.println(array.toString());;

        CustomGenericArrayList<Number> array = new CustomGenericArrayList<>();
        array.add(54);
        array.add(5.45);
        System.out.println(array.toString());
    }
}
