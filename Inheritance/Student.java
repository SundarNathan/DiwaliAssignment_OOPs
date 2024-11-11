
class Student{
    String name;
    int grade;

    Student(String name, int grade )
    {
        this.name=name;
        this.grade=grade;
    }
}
class ZSGSStudent extends Student{
    String branch;

    ZSGSStudent(String name, String branch, int grade)
    {
        super(name, grade);
        this.branch=branch;
    }

}
public class Main {

    public static void main(String[] args) {

        Student stu= new ZSGSStudent("Sundar", "Chennai", 12);

    }
}