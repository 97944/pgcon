package practice;

import java.util.Scanner;

public class Q2a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String str = scanner.next();
		scanner.close();
		for(int i=0;i<str.length();i++){
			if(i==0 || str.charAt(i-1) == ' '){
				System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
			}else{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}
}
