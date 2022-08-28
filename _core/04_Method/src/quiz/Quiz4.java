package quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		System.out.print("연산자를 입력> ");
		System.out.println("+, -, *, /, %");
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		
		System.out.println("첫번째 숫자 입력 >");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 >");
		int num2 = sc.nextInt();

		switch (op) {
		
		case "+":
			
			addition(op, num1, num2);
			break;
		case "-":
			substraction(op, num1, num2);
			break;
		case "*":
			int[] nums = {num1, num2};
			mutiplication(nums, op);
			break;
		case "/":
			double result = division(num1, op, num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case "%":
			double[] res = modulus(num1, op, num2);
			System.out.println(" / 의 결과 : " + res[0]);
			System.out.println(" % 의 결과 : " + res[1]);
			break;

		default:
			break;
		}
	} 
	private static double[] modulus(int n1, String op, int n2) {
		
		double[] results = new double[2];
		results[0] = (double) n1 / n2;
		results[1] = (double) n1 % n2;
		return results;
	}
	private static double division(int n1, String op, int n2) {
		
		return ((double)n1/n2);
	}

	private static void mutiplication(int[] nums, String op) {
		System.out.println(nums[0] + " x " + nums[1] + " = " +(nums[0]*nums[1]));
		
	}


	private static void substraction(String op, int n1, int n2) {
		System.out.println(n1 + " - " + n2 + " = " +(n1-n2));
		
	}


	private static void addition(String op, int n1, int n2) {
		
		System.out.println(n1 + " + " + n2 + " = " +(n1+n2));
	}

}
