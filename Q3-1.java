package Q1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		String n1 = scanner.next();
		String n2 = scanner.next();
		double n3 = scanner.nextDouble();
		scanner.close();

		System.out.print(str1);
		for(int i=0;i<19-str1.length();i++){
			System.out.print(" ");
		}
		System.out.print(" ");
		for(int i=0;i<19-str2.length();i++){
			System.out.print(" ");
		}
		System.out.print(str2);
		System.out.print(" ");

		String dummy = "";
		if(n1.charAt(0) =='-'){
			for(int i=0;i<9-n1.length();i++){
				dummy += "0";
			}
			System.out.print(n1.charAt(0));
			System.out.print(dummy);
			for(int i=1;i<n1.length();i++){
				System.out.print(n1.charAt(i));
			}
		}else{
			for(int i=0;i<9-n1.length();i++){
				dummy += "0";
			}
			System.out.print(dummy + "" + n1);
		}
		System.out.print(" ");

		for(int i=0;i<9-n2.length();i++){
			System.out.print(" ");
		}
		System.out.print(n2);
		System.out.print(" ");

		BigDecimal number3 = new BigDecimal(n3);
		number3 = number3.setScale(3, BigDecimal.ROUND_HALF_UP);
		for(int i=0;i<9-String.valueOf(number3).length();i++){
			System.out.print(" ");
		}
		System.out.println(number3);
	}

}