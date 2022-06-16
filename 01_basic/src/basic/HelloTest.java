package basic;

import java.util.Scanner;

public class HelloTest {
	public static void main(String[] args) {
		System.out.print("Hello Java\n");
		System.out.print("반갑습니다\n");
		System.out.println(25 + 36);
		System.out.println("25 + 36"); //25 + 36
		System.out.println("25"+"26"); //2526
		System.out.println("25 + 36 = 61"); 		
		System.out.println("25 / 36 =  " + (25.0/36)); //정수/정수 => 정수
		System.out.println("25 / 36 =  " + ((double)25/36)); // double로 실수형 선언 /정수 => 정수
		System.out.println("25 / 36 =  " + String.format("%.3f", (double)25/36)); // 소수 이하 3째 자리
	}
}
