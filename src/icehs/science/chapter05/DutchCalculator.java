package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumExpense=0;
		System.out.print("������ �� ������ ����Ǿ�����? : ");
		int numOfCha=getUserInput();
		System.out.println("===========================");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.print(i+"�� ��� : ");
			sumExpense+=getUserInput();
		}
		
		System.out.println("�� ����� "+sumExpense+"�� �Դϴ�.");
		System.out.println("===========================");
		System.out.print("������ �ο����� �Է��ϼ��� : ");
		int numOfPeop=getUserInput();
		System.out.println("===========================");
		System.out.println("��ġ���� �ݾ���?");
		int dutchMoney=sumExpense/numOfPeop;
		
		for(int i=1;i<=numOfPeop;i++) {
			if(i==numOfPeop) {
				System.out.println(numOfPeop+" : "+sumExpense+"��");
			}
			else {
				System.out.println(i+" : "+dutchMoney+"��");
				sumExpense-=dutchMoney;
			}
		}

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
