package practice;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int result = (int) (2 * Math.pow(n,2) + 2 * n + 1);
		System.out.println(result);
	}

}
