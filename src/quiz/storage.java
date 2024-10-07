package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class storage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, HashMap<String, Integer>> storage = 
				new HashMap<String, HashMap<String,Integer>>();
		String item=null, materials=null;
		
		boolean run =true;
		int choice, quantity=0;
		
		System.out.println("1.생산수량 등록");
		System.out.println("2.판매수량 등록");
		System.out.println("3.재고 폐기");
		System.out.println("4.재고 현황");
		System.out.print(">>>>");
		choice = sc.nextInt();
		
		if (choice ==1) {
			System.out.println("품목: JK/BL/SK/TR/ACC 중 입력");
			item = sc.next().toUpperCase();
			System.out.println("소재명/수량 입력");
			materials = sc.next();
			quantity = sc.nextInt();
			storage.get(item).put(materials, quantity);
			
			
		}else if (choice ==2) {
			
		}else if( choice ==3) {
			
		}else if (choice ==4) {
			
		}
	}

}
