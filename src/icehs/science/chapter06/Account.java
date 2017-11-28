package icehs.science.chapter06;

public class Account {
	String name;
	String number;
	int remainMoney; //balance
	
	void deposit(int wantToPlus) {
		remainMoney+=wantToPlus;
		System.out.println("ÀÜ¾× : "+remainMoney);
	}
	
	void withdraw(int wantToMinus) {
		remainMoney-=wantToMinus;
		System.out.println("ÀÜ¾× : "+remainMoney);
	}
	
	void displayAccountInfo() {
		System.out.println("¿¹±İÁÖ : "+name);
		System.out.println("°èÁÂ¹øÈ£ : "+number);
		System.out.println("ÀÜ¾× : "+remainMoney);
	}
	
	int checkMoney() {
		return remainMoney;
	}
}
