package ch03;

public class Course {

    String studentName;
    String address;
    int studentId;

    public void showStudentInfo(){
        System.out.println(studentId+address+studentName);
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName= name;
    }

}
