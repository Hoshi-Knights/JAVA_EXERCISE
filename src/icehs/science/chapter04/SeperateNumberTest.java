package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=456;
		
		int hundred=number/100;
		int ten=number%100/10;
		int one=number%100%10;
		
		System.out.println("���� : "+number);
		System.out.println("���� �ڸ� �� : "+hundred);
		System.out.println("���� �ڸ� �� : "+ten);
		System.out.println("���� �ڸ� �� : "+one);

	}

}
