package ch03;

public class studentTest {

    public static void main(String[]args){

        Course studentlee = new Course();

        studentlee.studentName = "lee";
        studentlee.studentId = 123;

        studentlee.address="관악구";

        studentlee.showStudentInfo();
        studentlee.setStudentName("han");
        studentlee.showStudentInfo();
        System.out.println(studentlee.getStudentName());
        }
}
