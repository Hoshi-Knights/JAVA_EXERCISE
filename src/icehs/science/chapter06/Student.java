package icehs.science.chapter06;

public class Student {
	String studentName;
	String studentNumber;
	int koreanScore;
	int englishScore;
	int mathScore;
	double average;
	
	double averageScore() {
		average=(koreanScore+englishScore+mathScore)/3.0;
		return average;
	}
	
	void printInformation() {
		System.out.println("�̸� : "+studentName);
		System.out.println("�й� : "+studentNumber);
		System.out.println("���� ���� : "+koreanScore);
		System.out.println("���� ���� : "+englishScore);
		System.out.println("���� ���� : "+mathScore);
	}
	
	void changeStudentNumber(String newStudentNumber) {
		studentNumber=newStudentNumber;
	}
}
