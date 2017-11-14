package icehs.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=500;i++) {
			sum+=i;
		}
		
		double average=sum/500.0;
		
		System.out.println("ÇÕ°è : "+sum);
		System.out.println("Æò±Õ : "+average);

	}

}
