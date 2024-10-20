package Oops;

public class Student {
    int rollNo;
    String name;
    String section;

    public Student(int roll, String naam, String section){
        name=naam;
        rollNo=roll;
        this.section=section;
    }

    public Student(){
        new Student(5,"Indra","B");
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", section='" + section + '\'' + "}";
    }

}
