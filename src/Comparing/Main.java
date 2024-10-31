package Comparing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student indra = new Student(1,100,"indra");
        Student mahin = new Student(2,99,"Mahin");
        Student balarm = new Student(3,98,"Balaram");
        Student[] arr = {indra,mahin,balarm};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(o1, o2) -> (int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(arr));

    }
}
