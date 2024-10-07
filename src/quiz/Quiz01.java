package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	
	//set 안에 hash map을 넣어서
	//set으로 품목명 정리 / map으로 소재별 수량 정리

	public static void main(String[] args) {
		//상품관리 시스템<품목, 소재, 수량>
		
		Scanner sc=new Scanner(System.in);
		HashSet <String> item = new HashSet<String>();
		HashMap <String, HashMap <String, Integer>> storage 
			= new HashMap <>();
		
		boolean run = true;
		
		
		while(run) {
		System.out.println("1. 생산 수량 등록");
		System.out.println("2. 판매 수량 등록");
		System.out.println("3. 재고 폐기");
		System.out.println("4. 재고 현황");
		System.out.print(">>>>>");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1. 생산수량 등록");
			System.out.println("------------");
			System.out.println("JK/BL/SK/TR/SH/ACC 중 선택");
			System.out.print("품목명: ");
			String itemin=sc.next().toUpperCase();
			storage.putIfAbsent(itemin, new HashMap<>());
			
			
			System.out.println("소재명 / 수량 입력" );
			sc.nextLine();
			String materials = sc.next();
			int quantity = sc.nextInt();
			
			storage.get(itemin).put(materials, quantity);
			//소재와 수량의 등록
			break;
			
		case 2:
			System.out.print("판매한 품목 입력>>");
			String searchitem = sc.next().toUpperCase();
			HashMap <String, Integer> itemMaterials= storage.get(searchitem);
			if( itemMaterials!=null) {
				System.out.print("소재명 입력>> ");
				String soldMaterials =sc.next();
				if(itemMaterials.containsKey(soldMaterials)) {
					int currentQuantity = itemMaterials.get(soldMaterials);
					System.out.println("현재 수량은 "+ currentQuantity);
					System.out.print("판매한 수량 입력>>");
					int soldQuantity = sc.nextInt();
					
					if (soldQuantity<=currentQuantity) {
						itemMaterials.put(soldMaterials, currentQuantity-soldQuantity);
						System.out.println(soldQuantity+"개가 판매되었습니다.");
					}
					else {
						System.out.println("판매수량이 현재 수량을 초과합니다");		
					}
					
					}else {
						System.out.println("해당 소재가 존재하지 않습니다.");
				}
			}
			else {
				System.out.println("해당 품목이 존재하지 않습니다.");
			}
			break;
			
		case 3:
			System.out.print("삭제하고자하는 품목 입력>>");
			String rmv =sc.next().toUpperCase();
			storage.remove(rmv);
			System.out.println(rmv+"가 삭제되었습니다.");
			break;
			
		case 4:
			for (String key : storage.keySet()) {
				System.out.println("품목: "+key);
				for (Map.Entry<String, Integer> entry : storage.get(key).entrySet()) {
					System.out.printf("소재: %-10s 수량: %d%n", entry.getKey(), entry.getValue());
				}System.out.println("=======================");
			}
			
			
			
			
			
			break;
		}
		}
		
		
		
		
		
		
		

	}

}
