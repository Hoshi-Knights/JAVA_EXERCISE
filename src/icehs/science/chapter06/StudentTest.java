package icehs.science.chapter06;

public class StudentTest {
	
	public static void main(String[] args) {
		Student student1=new Student();
		System.out.println(student1);
		student1.studentName="ȫ�浿";
		student1.studentNumber="S001";
		student1.koreanScore=94;
		student1.englishScore=80;
		student1.mathScore=89;
		
		student1.printInformation();
		
		System.out.println();
		System.out.println("* �й��� �����մϴ�!!!");
		System.out.println();
		
		student1.changeStudentNumber("STU0001");
		student1.printInformation();
	}
	
}
