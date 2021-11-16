package ch05;

public class SubjectTest {
    public static void main(String[]args){
        Student studentLee = new Student(1101,"이한울");

        studentLee.setKoreaSubject("국어",95);
        studentLee.setMathSubject("수학",93);


        Student studentKim = new Student(1141," 김한울");

        studentKim.setKoreaSubject("국어",55);
        studentKim.setMathSubject("수학",91);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
