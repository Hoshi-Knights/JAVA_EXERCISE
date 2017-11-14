package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=92;
		
		if(score<=100&&score>=90) System.out.println("A학점입니다.");
		else if(score<90&&score>=80) System.out.println("B학점입니다.");
		else if(score<80&&score>=70) System.out.println("C학점입니다.");
		else if(score<70&&score>=60) System.out.println("D학점입니다.");
		else System.out.println("F학점입니다.");
	}

}
