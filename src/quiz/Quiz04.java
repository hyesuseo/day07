package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz04 {

	public static void main(String[] args) {
		
		int choice;
		boolean run = true;
		String id, pw, idin, pwin;
		Scanner input = new Scanner (System.in);
		HashMap<String, String> login = new HashMap<String, String>();
		
		while(run) {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 모든 회원보기");
		System.out.println("4. 비밀번호 찾기");
		System.out.println("5. 시스템 종료");
		System.out.print(">>>>>");
		choice = input.nextInt();
		
		switch (choice) {
		case 1://회원가입
			System.out.println("회원가입");
			System.out.print("id 입력: ");
			idin = input.next();
			
			if(login.containsValue(idin)) {
				System.out.println("이미 존재하는 아이디입니다.");
			}else {
				System.out.print("pw 입력: ");
				pwin = input.next();
				login.put(idin, pwin);
			}
			System.out.println(login.values());
			break;
			
		case 2: //로그인
			System.out.print("id 입력: ");
			idin = input.next();
			if(!login.containsKey(idin)) {
				System.out.println("존재하지 않는 아이디입니다.");
			}else {
				System.out.println("pw 입력: ");
				pwin = input.next();
				if(!login.containsValue(pwin)) {
					System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("로그인 성공");
				}
			}
			
			break;
					
		case 3: //모든 회원보기
			Set<String> system = login.keySet();
			Iterator<String> it = system.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			break;
			
		case 4:// 비밀번호 찾기
			System.out.print("id 입력: ");
			idin = input.next();
			pw = login.get(idin);
			System.out.println("당신의 pw는 "+ pw+"입니다.");
			
			
			break;
			
			
		case 5:
			run = false;
			break;
		}
		
		
		
		
		
		
		
		
		
		
		}

	}

}
