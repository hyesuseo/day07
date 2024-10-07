package string_;

public class Ex02 {

	public static void main(String[] args) {
		String str1 = "      test          ";
		String str2 = "test    ";
		
		System.out.println("111" +str1+ "111");
		System.out.println("111" +str2+"111");
		System.out.println(str1.equals(str2)); //공백이 있어서 틀린값으로 나옴
		
		String s1 = str1.trim();
		String s2 = str2.trim();
		System.out.println("111" +s1+ "111");
		System.out.println("111" +s2+"111");

		
		String addr = "01234/서울/동대문구/답십리로 130"; 
		//이 값을 쪼개서 하나씩만 수정할 수 있도록
		String s []= addr.split("/"); //괄호안에 구분자를 넣어줌
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println("----------");
		for (int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("-------------------");
		String phone = "010-1234-5678";
		String replace = phone.replace("-", "");
		System.out.println(replace);
		
		System.out.println(phone.charAt(3)); //인덱스를 가져오는 기능!
	}

}
