package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveElevator() { //public void���� public�� ���� OK
		System.out.println("���������͸� �����մϴ�.");
	}
	
	void changeAddress(String newAddress) {
		address=newAddress;
	}
}
