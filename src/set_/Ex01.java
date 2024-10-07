package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> arr = new ArrayList<String>();
		
		set.add("김밥"); 	set.add("라면");
		set.add("순대"); 	set.add("라면");
		
		arr.add("라면"); arr.add("김밥");
		arr.add("순대"); arr.add("라면");
		
		System.out.println("set : "+set);
		System.out.println("arr : "+arr);
		
		System.out.println("--------------------");
		//로또 프로그램 1~45
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		Random ran = new Random ();
		for ( ; 6>arrInt.size(); ) {
			int r = ran.nextInt(6) + 1;
			if(!arrInt.contains(r)) {
				arrInt.add(r); 
			}//ArrayList는 중복값이 저장될 수 있음
			//중복을 처리하는 if 문이 하나 더 들어가야함 
			
		}
		System.out.println("arrInt: "+arrInt);
		
		HashSet<Integer> setInt = new HashSet<Integer>();
		
		for ( ; 6>setInt.size(); ) {
			setInt.add(ran.nextInt(6)+1); 
		} //중복되지 않는 숫자가 들어온다!
		System.out.println("setInt: "+setInt);
		
		
	}

}
