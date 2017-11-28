package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveElevator() { //public void에서 public을 빼도 OK
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	void changeAddress(String newAddress) {
		address=newAddress;
	}
}
