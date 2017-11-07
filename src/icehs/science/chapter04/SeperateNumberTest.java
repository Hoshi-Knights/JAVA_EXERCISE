package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=456;
		
		int hundred=number/100;
		int ten=number%100/10;
		int one=number%100%10;
		
		System.out.println("숫자 : "+number);
		System.out.println("백의 자리 수 : "+hundred);
		System.out.println("십의 자리 수 : "+ten);
		System.out.println("일의 자리 수 : "+one);

	}

}
