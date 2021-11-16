package ch04;

public class StudentTest {
    public static void main(String[]args){

        Student studentlee = new Student();

        System.out.println(studentlee.showStudentInfo());

        Student studentkim = new Student(2343,"김한울",2);

        System.out.println(studentkim.showStudentInfo());


    }
}
