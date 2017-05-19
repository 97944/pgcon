package prconpractice3;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		s = s.replaceAll("ta", "");
		System.out.println(s);
	}

}
