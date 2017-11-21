package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int index=1;
		
		while(sum<100) {
			sum+=index*5;
			System.out.println(index+". (+"+index++*5+") "+sum);
		}
		

	}

}
