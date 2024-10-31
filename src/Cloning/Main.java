package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1= new Student(1,"Object1");
        Student s2 = (Student) s1.clone();
        s1.names="Ocject2";
        s2.arr[0]=4523697;
        System.out.println(s2);
        System.out.println(s1);
    }
}
