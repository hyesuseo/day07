package quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("사과");
		fruit.add("오렌지");
		fruit.add("바나나");
		fruit.add("키위");
		fruit.add("망고");
		
		for (int i =0; i <fruit.size(); i++) {
			System.out.println(fruit.get(i)+" ");
		}
		System.out.println("과일은 "+fruit.size() + "개입니다.");
		
		
		fruit.remove(0);
		
		System.out.println("과일은 "+fruit.size() + "개입니다.");
		for (int i =0; i <fruit.size(); i++) {
			System.out.print(fruit.get(i)+" ");
		}
		fruit.remove("바나나");		
		System.out.println("과일은 "+fruit.size() + "개입니다.");
		for (int i =0; i <fruit.size(); i++) {
			System.out.println(fruit.get(i)+" ");
		}
		String infruit = sc.next();
		System.out.println(fruit.contains(infruit));

	}

}
