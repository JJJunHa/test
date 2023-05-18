
public class charAt {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str.charAt(6));//인덱스에 해당하는 문자를 가져온다.
		
		String a="0";
		int b = a.charAt(0);//숫자 0-9까지는 유니코드상 48-57이다.
		System.out.println(b);

	}

}
