package icehs.science.chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int korScore=0;
		do {
			System.out.print("한국어 점수를 입력하세요.");
			korScore=getUserInput();
		} while(korScore<0||korScore>100);
		System.out.println("한국어 점수는 "+korScore+"점 입니다.");

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
