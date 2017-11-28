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
		System.out.println("이름 : "+studentName);
		System.out.println("학번 : "+studentNumber);
		System.out.println("국어 성적 : "+koreanScore);
		System.out.println("영어 성적 : "+englishScore);
		System.out.println("수학 성적 : "+mathScore);
	}
	
	void changeStudentNumber(String newStudentNumber) {
		studentNumber=newStudentNumber;
	}
}
