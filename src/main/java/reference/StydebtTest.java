package reference;

public class StydebtTest {
    public static void main(String[] args) {
        Student4 studenLee = new Student4(1001,"Lee");

        studenLee.setKoreanSubject("국어",100);
        studenLee.setMathSubject("수학", 50);

        Student4 studentKim = new Student4(1002,"Kim");

        studentKim.setKoreanSubject("국어", 70);
        studentKim.setMathSubject("수학", 85);

        studenLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
