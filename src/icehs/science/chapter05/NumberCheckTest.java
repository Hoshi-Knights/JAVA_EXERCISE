package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("첫 번째 수를 입력하세요.");
		int a=getUserInput();
		System.out.println("두 번째 수를 입력하세요.");
		int b=getUserInput();
		int multiple=a*b;
		if(multiple<0) System.out.println(a+" * "+b+" : 음수는 확인하지 않습니다.");
		else if(multiple<10) System.out.println(a+" * "+b+" : 한 자리 수입니다.");
		else if(multiple<100) System.out.println(a+" * "+b+" : 두 자리 수입니다.");
		else System.out.println(a+" * "+b+" : 세 자리 수 이상입니다.");

	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
