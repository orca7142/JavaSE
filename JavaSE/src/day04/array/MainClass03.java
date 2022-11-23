package day04.array;

public class MainClass03 {
	public static void main(String[] args) {
		String[] names = {"피카츄", "라이츄", "파이리", "꼬부기", "질퍽이"};
		
		// 배열의 내용 출력하기
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 확장 for 문
		for(String tmp : names) {
			System.out.println(tmp);
		}
	}
}
