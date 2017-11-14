package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1=10;
		int score2=20;
		int score3=40;
		int score4=70;
		int score5=80;
		
		double result1=score1*score2/2*0.6;
		double result2=(score3+score4)/2*0.13;
		double result3=score5*0.27;
		
		double finalResult=result1+result2+result3;
		
		System.out.println("평가 점수 : "+(int)finalResult);
		int intResult=(int)finalResult/10;
		switch(intResult) {
		case 9: System.out.println("Special Class입니다!!"); break;
		case 8: System.out.println("Gold Class입니다!!"); break;
		case 7: System.out.println("Silver Class입니다!!"); break;
		case 6: System.out.println("Bronze Class입니다!!"); break;
		default: System.out.println("Member입니다!!");
		}

	}

}
