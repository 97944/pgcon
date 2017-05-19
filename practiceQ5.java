package prconpractice3;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() + 1;
		int result = 1 + 2 * ((n - 1) * n);
		System.out.println(result);
	}

}
