package set_;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); //부분집합이 아니므로 false
		System.out.println(A.containsAll(C)); //C는 A의 부분집합이므로 true
		
		System.out.println(A.addAll(B));
		System.out.println(A.retainAll(B));
		System.out.println(A.removeAll(B));
		
		
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}

	}

}
