package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ù ��° ���� �Է��ϼ���.");
		int a=getUserInput();
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int b=getUserInput();
		int multiple=a*b;
		if(multiple<0) System.out.println(a+" * "+b+" : ������ Ȯ������ �ʽ��ϴ�.");
		else if(multiple<10) System.out.println(a+" * "+b+" : �� �ڸ� ���Դϴ�.");
		else if(multiple<100) System.out.println(a+" * "+b+" : �� �ڸ� ���Դϴ�.");
		else System.out.println(a+" * "+b+" : �� �ڸ� �� �̻��Դϴ�.");

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
