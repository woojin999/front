package dataType;

public class NumberMethods {

	public static void main(String[] args) {
		//반올림
		System.out.println(Math.round(1024.389));
		// 절대값
		System.out.println(Math.abs(-1234));
		//최댓값, 최소값
		System.out.println(Math.max(1234, 1236));
		System.out.println(Math.min(1234, 1235));
		
		// 실수가 갖을 수 있는 천장값 바닥값
		System.out.println(Math.ceil(1234.5567));
		System.out.println(Math.floor(1234.5567));
		System.out.println(Math.ceil(-12345.678));
		System.out.println(Math.floor(-12345.678));
		
		//제곱 
		System.out.println(Math.pow(2, 10));
		//루트
		System.out.println(Math.sqrt(196));
		//랜덤
		System.out.println(Math.random()); // 0부터 1사이 실수
		System.out.println((int)(Math.floor(Math.random()*100)+1)); // 1 ~100
	}

}
