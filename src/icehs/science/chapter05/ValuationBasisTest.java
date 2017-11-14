package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1=10;
		int score2=20;
		int score3=40;
		int score4=50;
		int score5=80;
		
		double result1=score1*score2/2*0.6;
		double result2=(score3+score4)/2*0.13;
		double result3=score5*0.27;
		
		double finalResult=result1+result2+result3;
		
		System.out.println("평가 점수 : "+finalResult);
		if(finalResult>=95&&finalResult<=100) System.out.println("Special Class입니다!!");
		else if(finalResult>=90&&finalResult<95) System.out.println("Gold Class입니다!!");
		else if(finalResult>=85&&finalResult<90) System.out.println("Silver Class입니다!!");
		else if(finalResult>=80&&finalResult<85) System.out.println("Bronze Class입니다!!");
		else System.out.println("Member입니다!!");
		
	}

}
