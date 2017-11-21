package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumExpense=0;
		System.out.print("모임이 몇 차까지 진행되었나요? : ");
		int numOfCha=getUserInput();
		System.out.println("===========================");
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.print(i+"차 비용 : ");
			sumExpense+=getUserInput();
		}
		
		System.out.println("총 비용은 "+sumExpense+"원 입니다.");
		System.out.println("===========================");
		System.out.print("모임의 인원수를 입력하세요 : ");
		int numOfPeop=getUserInput();
		System.out.println("===========================");
		System.out.println("더치페이 금액은?");
		int dutchMoney=sumExpense/numOfPeop;
		
		for(int i=1;i<=numOfPeop;i++) {
			if(i==numOfPeop) {
				System.out.println(numOfPeop+" : "+sumExpense+"원");
			}
			else {
				System.out.println(i+" : "+dutchMoney+"원");
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
