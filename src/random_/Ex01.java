package random_;

import java.util.Random;

public class Ex01 {
	public static void main(String args[]) {
		
		for (int i =0; i<5; i++) {
			System.out.println(Math.random()); //double형태로 표현됨
		}
		
		System.out.println("--------------------------");
		//범위를 구하려면 연산이 필요하다!
		//0.00000001~0.999999 *3
		//=>0.0000003 ~2.999999
		// int형 변환을 한다면? : 0~2
		// 만약 여기서 +10을 하면? : 10~12의 값을 구할 수 있다.
		for (int i =0; i<5; i++) {
			
			double dou = Math.random() *3; 
			System.out.println((int)dou); // int형식으로 형변환
		}
		
		System.out.println("--------------------------");
		
		//직접적으로 random이라는 기능이 따로 있음
		Random ran = new Random();
		for (int i =0; i<5; i++) {
			int r= ran.nextInt(3);//괄호 안에 들어가는 숫자는 0~숫자범위
			System.out.println(r+10);
			
		}
		
		
	}
}
