package Cloning;

import java.util.Arrays;

public class Student implements Cloneable{
    int rollNo;
    String names;
    Integer[] arr;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.names = name;
        this.arr= new Integer[]{4,5,7};
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", names=" + names +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //this is shallow copy
        return super.clone();
        //deep copy doesnt copy refence, just values hencechanges in one object doesnt effect the other objcet
    }
}
