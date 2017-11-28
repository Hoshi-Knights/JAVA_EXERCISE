package icehs.science.chapter06;

public class Account {
	String name;
	String number;
	int remainMoney; //balance
	
	void deposit(int wantToPlus) {
		remainMoney+=wantToPlus;
		System.out.println("�ܾ� : "+remainMoney);
	}
	
	void withdraw(int wantToMinus) {
		remainMoney-=wantToMinus;
		System.out.println("�ܾ� : "+remainMoney);
	}
	
	void displayAccountInfo() {
		System.out.println("������ : "+name);
		System.out.println("���¹�ȣ : "+number);
		System.out.println("�ܾ� : "+remainMoney);
	}
	
	int checkMoney() {
		return remainMoney;
	}
}
