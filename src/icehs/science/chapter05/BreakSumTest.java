package icehs.science.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int inx=1;inx<=10;inx++) {
			sum+=inx;
			if(sum>30) {
				break;
			}
		}
		
		System.out.println("�հ� ��� : "+sum);

	}

}
