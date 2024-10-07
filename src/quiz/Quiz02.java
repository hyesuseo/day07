package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int choice, score = 0;
		Scanner sc = new Scanner(System.in);
		String answer;
		HashMap<String, String> word = new HashMap<String, String>();
		
		System.out.println("[[영어 단어 맞추기 퀴즈]]");
		System.out.println("[1] 과일");
		System.out.println("[2] 동물");
		System.out.println("[3] 색깔");
		System.out.print(">>>>>");
		
		
	while(true) {
			choice = sc.nextInt();
			switch(choice) {
			case 1: {//과일게임
				word.put("딸기", "strawberry");
				word.put("포도", "grape");
				word.put("수박", "watermelon");
				word.put("멜론", "melon");
				word.put("망고", "mango");
				
				break;
			}
			case 2: {//동물게임
				word.put("개", "dog");
				word.put("고양이", "cat");
				word.put("토끼", "rabbit");
				word.put("오리", "duck");
				word.put("쥐", "mouse");
				
				break;
			}
			case 3: {//색깔게임
				word.put("빨강", "red");
				word.put("파랑", "blue");
				word.put("노랑", "yellow");
				word.put("주황", "orange");
				word.put("핑크", "pink");
				
				break;
			}
			default: {
					System.out.println("올바른 숫자를 입력해주세요");
					continue;
			}
	
			}
	break;}
	
	Iterator <String> quests = word.keySet().iterator();
	
	while (quests.hasNext()){
		String quest=quests.next();
		char hint=word.get(quest).charAt(0);
        System.out.println(quest+"은(는) 영어로 무엇입니까?");
        
        System.out.println(hint+"로 시작합니다.");
        System.out.print(">>>");
        answer=sc.next().toLowerCase();
       
        
        if(word.get(quest).equals(answer)){
            System.out.println("정답!");
            score++;}
        else{
            System.err.println("오답.");
            System.out.println(">>"+word.get(quest));}}

    System.out.println(word.keySet().size()+" 문제 중 "+score+" 문제를 맞추셨습니다.");
    
        
	}
	
	}
	

