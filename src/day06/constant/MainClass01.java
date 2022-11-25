package day06.constant;

/*
 * [[ 상수 ]]
 * 		처음 할당된 값이 변경되지 않는다.
 * 		final 키워드 사용
 * 		통상적으로 상수는 대문자로 선언
 * 
 */



public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.14159; // 원주율, 모양은 변수지만 final을 사용해 상수가 됨
				
		// 원의 반지름
		int r = 10;
		// 원의 넓이
		double area = PI*r*r;
		
		
		System.out.println("원의 넓이: " + area);
		
		System.out.println("원주율: " + Math.PI);
		
		area = 0;
		
		// pow 메소드 : 거듭제곱
		area = Math.PI * Math.pow(r, 2);
		
		System.out.println("원의 넓이: " + area);
	}
}
