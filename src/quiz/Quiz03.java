package quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayList<String> playlist = new ArrayList <String>();
		
		System.out.println("3 개의 곡을 입력하세요");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i<3; i++) {
			String song = input.next();
			playlist.add(i, song);
		}
		
		System.out.println("삭제할 곡");
		String del = input.next();
		playlist.remove(del);
		
		System.out.println("업데이트된 플레이리스트");
		
		for(String song: playlist) {
			System.out.println("-"+song);
		}
		
		
	}

}
