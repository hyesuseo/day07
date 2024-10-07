package string_;

public class Ex01 {

	public static void main(String[] args) {
		
		String str1; //어떠한 값도 저장되어있지 않다. 
		String str2 = new String(); 
		// new를 사용하면 값이 무언가 저장되므로 에러가 발생하지 않는다.

		//초기화 방식 - 아래 둘 중 어떤 방식을 사용해도 된다.
		String str3= "test";
		String str4 = new String("aaaa");
		
		System.out.println("str1 : str1");
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		
		str4 = "Kim";
		System.out.println(str4.equals("kim"));
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		String s = str4.toUpperCase();
		
		//if (s.equals("KIM")) {
		// str4 = kim 
		if (str4.toUpperCase().equals("KIM")) {
			System.out.println("김씨입니다.");
		}else {
			System.out.println("아니군");
		}
	
	}

}
