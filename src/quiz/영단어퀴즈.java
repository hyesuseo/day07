package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 영단어퀴즈 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int score=0;
        String answer=new String();
        HashMap<String,String>word=new HashMap<String,String>();

        System.out.println("[[영어 단어 맞추기 퀴즈]]");

        System.out.println("[1] 과일");
        System.out.println("[2] 동물");
        System.out.println("[3] 색깔");

        while (true){
            int menu=input.nextInt();

            switch (menu) {
                case 1: {//과일
                    word.put("포도", "grape");
                    word.put("사과", "apple");
                    word.put("블루베리", "blueberry");
                    word.put("수박", "watermelon");
                    word.put("레몬", "lemon");
                    break;   }             
                case 2: {//동물
                    word.put("개", "dog");
                    word.put("코끼리", "elephant");
                    word.put("닭", "chicken");
                    word.put("염소", "goat");
                    word.put("고래", "whale");
                    break;}
                case 3: {//색깔{}
                    word.put("빨강", "red");
                    word.put("파랑", "blue");
                    word.put("주황", "orange");
                    word.put("하양", "white");
                    word.put("보라", "purple");
                    break;}
                default:{
                    System.out.println("올바른 숫자를 입력해주세요.");
                    continue;}
            }
            break;}


        Iterator<String>quests=word.keySet().iterator();

        while (quests.hasNext()) {
            String quest=quests.next();
            char hint=word.get(quest).charAt(0);
            System.out.println(quest+"은(는) 영어로 무엇입니까?");
            System.out.println(hint+"로 시작합니다.");
            System.out.print(">>>");
            answer=input.next().toLowerCase();
            

            if(word.get(quest).equals(answer)){
                System.out.println("정답!");
                score++;}
            else{
                System.err.println("오답.");
                System.out.println(">>"+word.get(quest));}}

        System.out.println(word.keySet().size()+" 문제 중 "+score+" 문제를 맞추셨습니다.");
        
    }

}