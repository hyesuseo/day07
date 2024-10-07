package random_;

import java.util.Random;

public class PT01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		for (int i = 0 ; i <6 ; i++) {
			int ranNum = ran.nextInt(6);
			
				System.out.println(ranNum);
			
			
		}
	}

}
