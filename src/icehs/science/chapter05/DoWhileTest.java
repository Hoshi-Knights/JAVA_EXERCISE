package icehs.science.chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int korScore=0;
		do {
			System.out.print("�ѱ��� ������ �Է��ϼ���.");
			korScore=getUserInput();
		} while(korScore<0||korScore>100);
		System.out.println("�ѱ��� ������ "+korScore+"�� �Դϴ�.");

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
