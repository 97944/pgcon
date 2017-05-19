package prcon3.p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		double e = scanner.nextDouble();
		System.out.format("%-19s %19s %09d %9d %9.3f\n",a,b,c,d,e);
	}

}
