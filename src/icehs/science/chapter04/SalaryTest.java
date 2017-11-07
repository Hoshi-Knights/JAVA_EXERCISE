package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=1000000;
		
		int year=salary*12;
		int taxYear=year*9/10;
		int bonus=salary*2/10*4;
		int taxBonus=bonus*945/1000;
		int total=taxYear+taxBonus;
		
		System.out.println("연봉 : "+year+", 세후 연봉 : "+taxYear);
		System.out.println("보너스 : "+bonus+", 세후 보너스 : "+taxBonus);
		System.out.println("지급액 : "+total);

	}

}
