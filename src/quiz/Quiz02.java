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
		
		
	while(true) {
			choice = sc.nextInt();
			switch(choice) {
			case 1: {//과일게임
				word.put("딸기", "Strawberry");
				word.put("포도", "Grape");
				word.put("수박", "Watermelon");
				word.put("멜론", "Melon");
				word.put("망고", "Mango");
				System.out.println("과일퀴즈 선택하셨습니다");
				break;
			}
			case 2: {//동물게임
				word.put("개", "Dog");
				word.put("고양이", "Cat");
				word.put("토끼", "Rabbit");
				word.put("오리", "Duck");
				word.put("쥐", "Mouse");
				System.out.println("동물퀴즈 선택하셨습니다");
				break;
			}
			case 3: {//색깔게임
				word.put("빨강", "Red");
				word.put("파랑", "Blue");
				word.put("노랑", "Yellow");
				word.put("주황", "Orange");
				word.put("핑크", "Pink");
				System.out.println("색깔퀴즈 선택하셨습니다");
				break;
			}
			default: {
					System.out.println("올바른 숫자를 입력해주세요");
				continue;
			}
	Iterator <String> quests = word.keySet().iterator();	}
	}
	
	while (quests.hasNext());{
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

