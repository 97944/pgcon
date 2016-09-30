package pgcon2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));

		String txt = scanner.next();
		String[] list = new String[txt.length()];

		for(int i=0;i<txt.length();i++){
			list[i]=String.valueOf(txt.charAt(i));
		}
		for(int i=txt.length()-1;i>=0;i--){
			System.out.print(list[i]);
		}
		System.out.println("");
		scanner.close();
	}
}
