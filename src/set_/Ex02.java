package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("1111");
		set.add("2222");
		set.add("3333");
		
		//boolean bool = set.remove("2222"); 
		// 데이터 값을 삭제할 수 있게 되고, t/f로 결과도출
		//t/f값이 필요한 경우 저장해서 쓰면 된다.
		//System.out.println("bool : " + bool);
		System.out.println("set : " + set);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		//반복자 기능
		Iterator <Integer> it = arr.iterator();
		/*
		System.out.println(it.hasNext()); //it다음 값이 있는가?
		System.out.println(it.next());	//it 다음 값으로 이동 후 값을 출력
		System.out.println(it.next());	
		System.out.println(it.next());	
		System.out.println(it.hasNext()); //it다음 값이 있는가?
		System.out.println(it.next());	*/
		//반복문을 이용해서 아래와 같이 출력할 수 있다!
		
		while(it.hasNext()) { //이런 느낌을 나중에 웹에서 많이 사용한다고!
			System.out.println(it.next());
		}
		
		System.out.println("------set을 반복자 이용하기------");
		Iterator <String> its = set.iterator();
		while(its.hasNext()) {
			String s =its.next();
			System.out.println( s );
		}
		
	}

}
