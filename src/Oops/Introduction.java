package Oops;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args){
        Student[] students = new Student[5];
        Student student1 = new Student(20, "Indra", "A");
        students[0]=student1;
        Student student2 = student1;
        students[1]=student2;
        Student student3 = new Student(22, "Kalyani", "A");
        students[2]=student3;
        Student student4 = new Student(23, "Raghu", "B");
        students[3]=student4;
        Student student5 = new Student(24, "Nitu", "A");
        students[4]=student5;
        student2.rollNo=30;
        student3.rollNo=50;
        System.out.println(student2==student1);

        System.out.println(Arrays.toString(students));

        Student rando = new Student();
        System.out.println(rando.name);
        final Test test1 = new Test(1);
        Test test2 = test1;
        test2.num=5;
        test2 = new Test(6);
        System.out.println(test2.num);

    }



}

class Test{
    int num;
    Test(int num){
        this.num=num;
    }
}