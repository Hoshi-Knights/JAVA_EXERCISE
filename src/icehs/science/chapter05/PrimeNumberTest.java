package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�Ҽ����� �����ϰ� ���� ���ڸ� �Է��ϼ��� : ");
		int firstNo=getUserInput();
		
		for(int i=2;i<=firstNo;i++) {
			if(firstNo==i) {
				System.out.println(firstNo+"�� �Ҽ��Դϴ�.");
			} else if(firstNo%i==0) {
				System.out.println(firstNo+"�� �Ҽ��� �ƴմϴ�.");
				break;
			}
		}

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
