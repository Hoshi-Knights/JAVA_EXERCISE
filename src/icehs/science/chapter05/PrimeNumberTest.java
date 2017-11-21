package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("소수인지 판정하고 싶은 숫자를 입력하세요 : ");
		int firstNo=getUserInput();
		
		for(int i=2;i<=firstNo;i++) {
			if(firstNo==i) {
				System.out.println(firstNo+"은 소수입니다.");
			} else if(firstNo%i==0) {
				System.out.println(firstNo+"은 소수가 아닙니다.");
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
