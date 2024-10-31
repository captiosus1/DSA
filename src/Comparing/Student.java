package Comparing;

public class Student {
    int rollNo;
    float marks;
    String name;

    public Student(int rollNo, float marks,  String name) {
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return (int)(this.marks-o.marks);
//    }
}
