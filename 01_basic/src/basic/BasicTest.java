package basic;

public class BasicTest {
	public static void main(String[] args) {
		System.out.println((char)('D'+3));
		System.out.println((char)('D'+32)); //32차이로 대소문자 바뀜
		System.out.println("A" + 3);
		System.out.println();
		System.out.println(2+5);
		System.out.println('2'+'5'); //50+53
		System.out.println("2"+'5'); //아스키코드 대충 외울부분 외울것.
		System.out.println('2'-48 +'5'-48);
		System.out.println((Integer.parseInt("2")+Double.parseDouble("5"))); //문자열을 숫자로 변환 (integer), 실수형 (double)
	} //integer.parseint => 자바스크립트 함수
}
