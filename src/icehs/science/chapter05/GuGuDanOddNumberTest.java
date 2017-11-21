package icehs.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(i*j%2!=0) {
					System.out.println(i+" * "+j+" = "+i*j);
				}
			}
		}

	}

}
