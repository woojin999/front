package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		output(10,'#');
	}

	private static void output(int i, char c) {
		for (int j = 0; j < i; j++) {
			System.out.print(c + " ");
		}
	}

}
