package Oops.Packages;

public class School {
    int grade;
    int section;
    String name;
    int roll;
    static int totalStudents;

    School(int grade,int section, String name, int roll){
        this.grade=grade;
        this.section=section;
        this.name=name;
        this.roll=roll;
        School.totalStudents=totalStudents+1;
    }
}
